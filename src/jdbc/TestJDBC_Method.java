package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJDBC_Method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. JDBC Driver 객체생성
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading 성공");

		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		}

		// 2. connection 객체 생성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement statement = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			statement = conn.createStatement();

			// 3. Statement(SQL문 전송) 객체 생성
			// createStatement() = Factory Method

			// 4.sql문 실행
			String sql = "update emp set sal = 2450, comm = null where empno = 7782";
			int rowCnt = statement.executeUpdate(sql);
			printRowCnt(rowCnt);

			sql = "select empno, ename, hiredate,sal,comm from emp";
			ResultSet rs = statement.executeQuery(sql);
			priontSelect(rs);

			sql = "insert into emp VALUES(8001, '에스큐엘',  'CLERK', 7782, TO_DATE('1-1-2021', 'DD-MM-YYYY'), 4500,null,20 )";
			rowCnt = statement.executeUpdate(sql);
			printRowCnt(rowCnt);

//         System.out.println("사번을 입력하세요");
//         int eNo = Integer.parseInt(scan.nextLine()); 
//         System.out.println("사원명을 입력하세요");
//         String eName = scan.nextLine();
//         System.out.println("직군을 입력하세요");
//         String job = scan.nextLine();
//         System.out.println("매니저 사번을 입력하세요");
//         int mgr = Integer.parseInt(scan.nextLine()); 
//         System.out.println("입사일을 입력하세요");
//         String hireDate= scan.nextLine();
//         System.out.println("급여를 입력하세요");
//         int sal = Integer.parseInt(scan.nextLine()); 
//         System.out.println("부서번호를 입력하세요");
//         int deptno = Integer.parseInt(scan.nextLine()); 
//         
//         sql = "insert into emp VALUES("+eNo+ ",'"+eName+"','"+job+"',"+mgr+", "
//         		+ "TO_DATE( '"+ hireDate +"', 'DD-MM-YYYY'),"+ sal+",null,"+deptno+")";
//         rowCnt = statement.executeUpdate(sql);
//         printRowCnt(rowCnt);

			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);

			sql = "update emp set job = '" + args[0] + "', sal = " + args[1] + " where empno = " + args[2];
			rowCnt = statement.executeUpdate(sql);
			printRowCnt(rowCnt);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close(conn, statement);
			} catch (Exception e) {
				System.err.println("에러 메세지" + e.getMessage());
				e.printStackTrace();
			}

		}

	}

	public static void printRowCnt(int rowCnt) {
		System.out.println("갱신된 건수:" + rowCnt);
	}

	public static void priontSelect(ResultSet rs) throws SQLException {
		while (rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			Date hiredate = rs.getDate(3);
			float sal = rs.getFloat(4);
			String comm = rs.getString(5);

			System.out.println(empno + " \t" + ename + " \t" + hiredate + " \t" + sal + " \t" + comm);
		}
	}

	public static void close(Connection conn, Statement statement) throws SQLException {
		statement.close();
		conn.close();
	}

}