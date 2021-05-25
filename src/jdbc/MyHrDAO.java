package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyHrDAO {
   public Connection conn = null;
   public final String url = "jdbc:oracle:thin:@localhost:1521:xe";
   public final String user = "hr";
   public final String password = "hr";

   public MyHrDAO() {
	   try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loading ¼º°ø");

		} catch (ClassNotFoundException exception) {
			exception.printStackTrace();
		}
      String url = this.url;
      String user = this.user;
      String password = this.password;
      try {
         this.conn = DriverManager.getConnection(url, user, password);
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public void selectEmployee(int empid) {
      PreparedStatement pstmt;
      try {
         String sql = "select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL from employees where EMPLOYEE_ID = ?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, empid);
         ResultSet rs = pstmt.executeQuery();

         while (rs.next()) {
            String EMPLOYEE_ID = rs.getString(1);
            String FIRST_NAME = rs.getString(2);
            String LAST_NAME = rs.getString(3);
            String EMAIL = rs.getString(4);

            System.out.println(EMPLOYEE_ID + " \t" + FIRST_NAME + " \t" + LAST_NAME + " \t" + EMAIL);
         }
      }catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }
   }

   public void selectEmployees() {
      Statement statement;
      try {
         String sql = "select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL from employees";
         statement = conn.createStatement();
         ResultSet rs = statement.executeQuery(sql);

         while (rs.next()) {
            String EMPLOYEE_ID = rs.getString(1);
            String FIRST_NAME = rs.getString(2);
            String LAST_NAME = rs.getString(3);
            String EMAIL = rs.getString(4);

            System.out.println(EMPLOYEE_ID + " \t" + FIRST_NAME + " \t" + LAST_NAME + " \t" + EMAIL);
         }
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }

   }
}