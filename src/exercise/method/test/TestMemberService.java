package exercise.method.test;

import exercise.method.MemberService;

public class TestMemberService {
	public static void main(String[] args) {
		MemberService memberServie = new MemberService();
		boolean result = memberServie.login("hong", "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			memberServie.logout("hong");
			
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
