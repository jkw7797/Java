package scanner;

import java.util.Scanner;

public class MyScacnner {

	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		//InputStream = System.in
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 이름은: ");
		String name = scan.next();
		
		System.out.println(name+"님 환영합니다.");
		System.out.println("성별에 해당하는 숫자를 입력하세요.");
		int gender = scan.nextInt();
		if (gender ==1 || gender == 3) {
			System.out.println("남자입니다.");
		}
		if (gender ==2 || gender ==4) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("성별에 해당하는 숫자값이 아닙니다.");
		}
		
		//scanner 닫기
		scan.close();
	}

}
