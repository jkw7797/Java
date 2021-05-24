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
		// 1. JDBC Driver ��ü����
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading ����");

		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		}

		// 2. connection ��ü ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement statement = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			statement = conn.createStatement();

			// 3. Statement(SQL�� ����) ��ü ����
			// createStatement() = Factory Method

			// 4.sql�� ����
			String sql = "update emp set sal = 2450, comm = null where empno = 7782";
			int rowCnt = statement.executeUpdate(sql);
			printRowCnt(rowCnt);

			sql = "select empno, ename, hiredate,sal,comm from emp";
			ResultSet rs = statement.executeQuery(sql);
			priontSelect(rs);

			sql = "insert into emp VALUES(8001, '����ť��',  'CLERK', 7782, TO_DATE('1-1-2021', 'DD-MM-YYYY'), 4500,null,20 )";
			rowCnt = statement.executeUpdate(sql);
			printRowCnt(rowCnt);

//         System.out.println("����� �Է��ϼ���");
//         int eNo = Integer.parseInt(scan.nextLine()); 
//         System.out.println("������� �Է��ϼ���");
//         String eName = scan.nextLine();
//         System.out.println("������ �Է��ϼ���");
//         String job = scan.nextLine();
//         System.out.println("�Ŵ��� ����� �Է��ϼ���");
//         int mgr = Integer.parseInt(scan.nextLine()); 
//         System.out.println("�Ի����� �Է��ϼ���");
//         String hireDate= scan.nextLine();
//         System.out.println("�޿��� �Է��ϼ���");
//         int sal = Integer.parseInt(scan.nextLine()); 
//         System.out.println("�μ���ȣ�� �Է��ϼ���");
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
				System.err.println("���� �޼���" + e.getMessage());
				e.printStackTrace();
			}

		}

	}

	public static void printRowCnt(int rowCnt) {
		System.out.println("���ŵ� �Ǽ�:" + rowCnt);
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