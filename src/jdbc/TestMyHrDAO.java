package jdbc;

public class TestMyHrDAO {
   public static void main(String[] args) {
      MyHrDAO mHrDAO = new MyHrDAO();
      System.out.println("===================================");
      mHrDAO.selectEmployees();
      System.out.println("===================================");
      mHrDAO.selectEmployee(100);
   }
}