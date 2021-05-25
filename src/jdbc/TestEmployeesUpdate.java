package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestEmployeesUpdate {
	//Connection�� �ν��Ͻ� ������ ����
	Connection connection;
	final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	final String user = "hr";
	final String password = "hr";
	
	//������ ����
	public TestEmployeesUpdate() {
		//1.Driver Loading 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading OK");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2.Connection ����
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
			System.out.println("�̸����ּ�, �޿�,�μ�Ƽ��,�����ȣ ���� �ʿ��մϴ�.");
			System.exit(0);
		}
		//�̸����ּ�
		String email = args[0];
		//�޿�
		float salary = Float.parseFloat(args[1]);
		//�μ�Ƽ��
		float comm = Float.parseFloat(args[2]);
		//�����ȣ
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
			//3. PreparedStatemet ���� - update
			pstmt = connection.prepareStatement(updateSql);
			//Sql �Ķ���Ϳ� ���� set
			pstmt.setString(1, email);  //�̸����ּ�
			pstmt.setFloat(2, salary);  //�޿�
			pstmt.setFloat(3, comm);    //Ŀ�̼�
			pstmt.setInt(4, empId);
			//4. update SQL ����
			int updCnt = pstmt.executeUpdate();
			System.out.println("���ŵ� �Ǽ� :" + updCnt) ;
			//3.1 PreparedStatemet ���� - select
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