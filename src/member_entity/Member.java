package member_entity;

public class Member {
	public String name;
	public String addr;
	public int age;
	
	//생성자 중복정의(constructor overloading)
	
	//기본생성자(default constructor)선언
	//생성자의 이름은 반드시 클래스명과 같아야 한다.
	//생성자는 리턴타입이 없다. (void도 아니다.)
	//생성자가 호출되는 시점은 new 연산자를 이용해 객체를 생성할때 호출된다.
	public Member() {
		System.out.println("기본생성자 호출됨!!");
		name = "김멤버";
		age =10;
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Member(String name, int age, String addr) {
//		this.name = name;
//		this.age = age;
		this(name,age);
		this.addr = addr;
	}
}
