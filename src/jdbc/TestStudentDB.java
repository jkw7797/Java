package jdbc;

public class TestStudentDB {
	public static void main(String[] args) {
		StudentDB sDB = new StudentDB();
		System.out.println("시험 점수가 가장 높은 사람 이름을 출력하세요");
		sDB.selectMaxScore();
		int age =28;
		System.out.println("나이가 "+age +"살인 학생 이름을 출력하세요");
		sDB.selectAge(28);
	}
}
