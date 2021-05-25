package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_PreparedStatement_exam {
	public static void main(String[] args) {

		if (args.length < 4) {
			System.out.println("아규먼트를 입력하고 실행하세요");
			System.exit(0);
		}

		String email = args[0];
		int sal = Integer.parseInt(args[1]);
		float com = Float.parseFloat(args[2]);
		int id = Integer.parseInt(args[3]);
		System.out.println(email + " " + sal + " " + com + " " + id);
		update(email, sal, com, id);
	}

	public static void update(String email, int sal, float com, int id) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		PreparedStatement ptsm = null;
		Statement statement = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			StringBuilder builder2 = new StringBuilder();

			builder2.append("update employees set email = ?");
			builder2.append(", salary = ?");
			builder2.append(", commission_pct = ?");
			builder2.append(" where employee_id  = ?");
			String sql = builder2.toString();

			ptsm = conn.prepareStatement(builder2.toString());
			ptsm.setString(1, email);
			ptsm.setInt(2, sal);
			ptsm.setFloat(3, com);
			ptsm.setInt(4, id);
			
			int rowCnt = ptsm.executeUpdate();
			System.out.println("갱신된 건수:" + rowCnt);

//			if (rowCnt == 0) {
//				conn.rollback();
//			} else {
//				conn.commit();
//			}
			statement = conn.createStatement();
			String selectSql = "select EMPLOYEE_ID, first_name,last_name, email, salary, commission_pct "
					+ "from employees  where employee_id =" + id;
			ResultSet rs = statement.executeQuery(selectSql);
			while (rs.next()) {
				int eMPLOYEE_ID = rs.getInt(1);
				String fIRST_NAME = rs.getString(2);
				String lAST_NAME = rs.getString(3);
				String eMAIL = rs.getString(4);
				int sALARY = rs.getInt(5);
				float cOMMISSION_PCT = rs.getFloat(6);

				System.out.println(eMPLOYEE_ID + " \t" + fIRST_NAME + lAST_NAME + " \t" + eMAIL + " \t" + sALARY + " \t"
						+ cOMMISSION_PCT);
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
				ptsm.close();
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
