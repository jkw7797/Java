package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCParameter {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("�ƱԸ�Ʈ�� �Է��ϰ� �����ϼ���");
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
		int eNo = Integer.parseInt(args[1]);
		StringBuilder builder2 = new StringBuilder();
		builder2.append("delete from " + tName);
		builder2.append(" where empno = " + eNo);
		sql = builder2.toString();
		System.out.println(sql);
		update(sql);
	}

	public static void update(String updateSql) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement statement = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("���� Ŀ��:" + conn.getAutoCommit());
			conn.setAutoCommit(false);
			System.out.println("���� Ŀ��:" + conn.getAutoCommit());
			statement = conn.createStatement();

			int rowCnt = statement.executeUpdate(updateSql);
			System.out.println("���ŵ� �Ǽ�:" + rowCnt);
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
			{

			}
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				conn.close();
			} catch (Exception e) {
				System.err.println("���� �޼���" + e.getMessage());
				e.printStackTrace();
			}

		}
	}

	public static void printRowCnt(int rowCnt) {
		System.out.println("���ŵ� �Ǽ�: " + rowCnt);
	}

	public static void close(Connection conn, Statement statement) throws SQLException {
		statement.close();
		conn.close();
	}
}
