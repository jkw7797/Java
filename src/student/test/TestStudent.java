package student.test;

import student_entity.Student;

public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student.id
		//new �����ڸ� ����ؼ� ��ü�� �����Ѵ�.
		Student student = new Student();
		long id = student.id;
		id = 10;
		student.name = "ȫ�浿";
		System.out.printf("�й� id \t %d%n",id);
		System.out.printf("�̸� name \t %s%n",student.name);
		System.out.printf("�г� grade \t %d%n",student.grade);
		System.out.printf("���� gender \t %s%n",student.gender);
		
		
	}

}
