package jdbc;

public class TestStudentDB {
	public static void main(String[] args) {
		StudentDB sDB = new StudentDB();
		System.out.println("���� ������ ���� ���� ��� �̸��� ����ϼ���");
		sDB.selectMaxScore();
		int age =28;
		System.out.println("���̰� "+age +"���� �л� �̸��� ����ϼ���");
		sDB.selectAge(28);
	}
}
