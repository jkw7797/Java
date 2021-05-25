package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestEmployeesUpdate {
	//Connection을 인스턴스 변수로 선언
	Connection connection;
	final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	final String user = "hr";
	final String password = "hr";
	
	//생성자 선언
	public TestEmployeesUpdate() {
		//1.Driver Loading 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading OK");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2.Connection 생성
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection.getClass().getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		if(args.length < 4) {
			System.out.println("이메일주소, 급여,인센티브,사원번호 값이 필요합니다.");
			System.exit(0);
		}
		//이메일주소
		String email = args[0];
		//급여
		float salary = Float.parseFloat(args[1]);
		//인센티브
		float comm = Float.parseFloat(args[2]);
		//사원번호
		int empId = Integer.parseInt(args[3]);
		System.out.println(email + " " + salary + " " + comm + " " + empId);
		
		TestEmployeesUpdate test = new TestEmployeesUpdate();
		test.updateEmployees(email, salary, comm, empId);
	}
	
	public void updateEmployees(String email,float salary, 
			float comm, int empId) {
		/*
		 * update employees 
		 * set email = 'gildong@aa.com', 
			    salary = 8700, 
			    commission_pct = 0.8
			where employee_id = 300
		 */
		StringBuilder builder = new StringBuilder();
		builder.append("update employees ")
		       .append("set email = ?,")
		       .append("salary = ?,")
		       .append("commission_pct = ? ")
		       .append("where employee_id = ?");
		String updateSql = builder.toString();
		System.out.println(updateSql);
		/*
		 * select employee_id,first_name,
		 *        email,salary,commission_pct
		 * from employees
			where employee_id = 300
		 */
		builder = new StringBuilder();
		builder.append("select employee_id,first_name,")
			   .append("email,salary,commission_pct ")
			   .append("from employees ")
			   .append("where employee_id = ?");
		String selectSql = builder.toString();
		System.out.println(selectSql);
		
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		try {
			//3. PreparedStatemet 생성 - update
			pstmt = connection.prepareStatement(updateSql);
			//Sql 파라미터에 값을 set
			pstmt.setString(1, email);  //이메일주소
			pstmt.setFloat(2, salary);  //급여
			pstmt.setFloat(3, comm);    //커미션
			pstmt.setInt(4, empId);
			//4. update SQL 실행
			int updCnt = pstmt.executeUpdate();
			System.out.println("갱신된 건수 :" + updCnt) ;
			//3.1 PreparedStatemet 생성 - select
			pstmt2 = connection.prepareStatement(selectSql);
			pstmt2.setInt(1, empId);
			ResultSet rs = pstmt2.executeQuery();
			//select employee_id,first_name,email,salary,commission_pct
			while(rs.next()) {
				int emp_id = rs.getInt("employee_id");
				String emp_name = rs.getString("first_name");
				String emp_email = rs.getString("email");
				float emp_salary = rs.getFloat("salary");
				float emp_comm = rs.getFloat("commission_pct");
				System.out.println(emp_id + " " +
								   emp_name + " " +
								   emp_email + " " +
								   emp_salary + " " +
								   emp_comm);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}