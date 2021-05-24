package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
		// 1. JDBC Driver 객체생성
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			System.out.println("Driver Loading 성공");
//
//		} catch (ClassNotFoundException exception) {
//			System.err.println("에러 메세지" + exception.getMessage());
//			exception.printStackTrace();
//		}

		// 2. connection 객체 생성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement statement = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn.getClass().getName());

			// 3. Statement(SQL문 전송) 객체 생성
			// createStatement() = Factory Method

			statement = conn.createStatement();
			System.out.println(statement.getClass().getName());

			String sql = "update emp set sal = 2450, comm = null where empno = 7782";

			// 4.sql문 실행
			int rowCnt = statement.executeUpdate(sql);
			System.out.println("갱신된 건수:" + rowCnt);

			String selectSql = "select empno, ename, hiredate,sal,comm from emp";
			ResultSet rs = statement.executeQuery(selectSql);
			System.out.println(rs.getClass().getName());
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				Date hiredate = rs.getDate(3);
				float sal = rs.getFloat(4);
				String comm = rs.getString(5);

				System.out.println(empno + " \t" + ename + " \t" + hiredate + " \t" + sal + " \t" + comm);
			}
			
			sql = "insert into emp VALUES(8001, '에스큐엘',  'CLERK', 7782, TO_DATE('1-1-2021', 'DD-MM-YYYY'), 4500,null,20 )";
			rowCnt = statement.executeUpdate(sql);
			System.out.println("Insert 갱신된 건수:" + rowCnt);


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("에러 메세지" + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				conn.close();	
			}
			catch (Exception e) {
				System.err.println("에러 메세지" + e.getMessage());
				e.printStackTrace();
			}
			
		}

	}
}
