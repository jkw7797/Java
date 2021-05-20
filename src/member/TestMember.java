package member;

import member_entity.Member;

public class TestMember {
	public static void main(String[] args) {
		Member member = new Member();
		System.out.println(member.name);
		System.out.println(member.age);

		
		System.out.println(member.name);
		System.out.println(member.addr);
		System.out.println(member.age);
		System.out.println();
		
		member.name = "ÃÖÇÏ¾á";
		member.age = 23;
		
		Member member2 = new Member("È«±æµ¿",12);
		System.out.println(member2.name);
		System.out.println(member2.age);
		System.out.println();
		
		Member member3 = new Member("È«±æµ¿",200,"Áý°¡°í ½Í´Ù...");
		System.out.println(member3.name);
		System.out.println(member3.age);
		System.out.println(member3.addr);


		
	}
}
