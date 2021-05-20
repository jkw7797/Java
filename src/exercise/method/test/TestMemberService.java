package exercise.method.test;

import exercise.method.MemberService;

public class TestMemberService {
	public static void main(String[] args) {
		MemberService memberServie = new MemberService();
		boolean result = memberServie.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되엇습니다");
			memberServie.logout("hong");
			
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
