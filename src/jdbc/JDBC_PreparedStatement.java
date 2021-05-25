package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_PreparedStatement {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("아규먼트를 입력하고 실행하세요");
			System.exit(0);
		}
//		String jobName = args[0];
//		int sal = Integer.parseInt(args[1]);
//		int eNo = Integer.parseInt(args[2]);

		String sql;

//		StringBuilder builder = new StringBuilder();
//		builder.append("update emp set job='" + jobName);
//		builder.append("', sal = " + sal);
//		builder.append(" where empno = " + eNo);

//		sql = builder.toString();
//		System.out.println(sql);
//		update(sql);
		String tName = args[0];
		String job = args[1];
		int sal = Integer.parseInt(args[2]);
		int eNo = Integer.parseInt(args[3]);

//		StringBuilder builder2 = new StringBuilder();
//		builder2.append("delete from ?");
//		builder2.append(" where empno = ?" );
//		sql = builder2.toString();
//		System.out.println(sql);
		System.out.println(tName + " " + eNo);
		update(eNo, job, sal);
	}

	public static void update(int eNo, String job, int sal) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement statement = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			// 오토커밋 취소
			conn.setAutoCommit(false);
			StringBuilder builder2 = new StringBuilder();
			builder2.append("update emp set job = ?, sal = ? where empno = ?");
			String sql = builder2.toString();
			System.out.println(sql);
			// PreparedStatement 생성
			statement = conn.prepareStatement(builder2.toString());
			// SQL문의 파리미터에 값을 설정
//			statement.setString(1, tName);
			statement.setString(1, job);
			statement.setInt(2, sal);
			statement.setInt(3, eNo);

			int rowCnt = statement.executeUpdate();
			System.out.println("갱신된 건수:" + rowCnt);
			if (rowCnt == 0) {
				conn.rollback();
			} else {
				conn.commit();
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				conn.close();
			} catch (Exception e) {
				System.err.println("에러 메세지" + e.getMessage());
				e.printStackTrace();
			}

		}
	}

	public static void printRowCnt(int rowCnt) {
		System.out.println("갱신된 건수: " + rowCnt);
	}

	public static void close(Connection conn, Statement statement) throws SQLException {
		statement.close();
		conn.close();
	}
}
