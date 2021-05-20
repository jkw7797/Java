//컴파일 명령어 : javac.exe HellowJava.java
//실행 명령어 : java.exe HelloJava "홍 길동" 1

public class HelloJava {
	// 실행이 가능한 자바 클래스가 되려면 main 매서드가 반드시 선언되어 있어야 한다.
	public static void main(String[] args) {// main = 매소드 (String[] args) = argument/파라미터

		System.out.println("아규먼트 길이: " + args.length);
		if (args.length == 0) {
			// 안내 메세지
			System.out.println("Usages : java HelloJava 이름");
			// 프로그램 종료
			System.exit(-1);
		} // if
		String name = args[0];
		// 두번째 argument가 1이거나 3이면 남자, 2이거나 4이면 여자
		System.out.println(args[0]);
		System.out.println(args[1]);

		String genderStr = args[1];
		int gender = Integer.parseInt(genderStr);
		String gen;
		System.out.println("Hello " + name);
		if (gender == 1 || gender == 3) {
			System.out.println("남자");
			gen = "남자";
		}else if (gender == 2 || gender == 4) {
			System.out.println("여자");
			gen = "여자";
		}
		else {
			System.out.println("Usages : java HelloJava 이름 성별(1~4)");
			gen = "err";
			System.exit(-1);
			}

			System.out.println("Hello " + gen);

	}// main
}// class