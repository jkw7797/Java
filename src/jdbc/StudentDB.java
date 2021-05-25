package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
	public Connection conn = null;
	public final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public final String user = "scott";
	public final String password = "tiger";

	public StudentDB() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading ¼º°ø");

		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectMaxScore() {
		Statement statement;
		try {
			String sql = "select sName from student where score =(select Max(score)from student)";
			statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				String sName = rs.getString("sName");

				System.out.println("\t>"+sName);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void selectAge(int age) {
		PreparedStatement ptmt;
		try {
			String sql = "select sName from student where age = (2021 - ? +1 )";
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, age);
			ResultSet rs = ptmt.executeQuery();
			while (rs.next()) {
				String sName = rs.getString("sName");
				System.out.println("\t>"+sName);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
