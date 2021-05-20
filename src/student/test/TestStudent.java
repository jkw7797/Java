package student.test;

import student_entity.Student;

public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student.id
		//new 연산자를 사용해서 객체를 생성한다.
		Student student = new Student();
		long id = student.id;
		id = 10;
		student.name = "홍길동";
		System.out.printf("학번 id \t %d%n",id);
		System.out.printf("이름 name \t %s%n",student.name);
		System.out.printf("학년 grade \t %d%n",student.grade);
		System.out.printf("성별 gender \t %s%n",student.gender);
		
		
	}

}
