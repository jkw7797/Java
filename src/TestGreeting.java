import basic.Greeting;

public class TestGreeting {
	public static void main(String[] args) {
//		Greeting.greet(); = X
//		greet 클래스를 메모리 올려서 객체생성을 해야함
//		new Greeting(); //Greeting이라는 클래스 호출 하지만  바로는 안됨
//		Greeting이라는 클래스로 부터 메모리상에
//		Loading(적재)를 하기 위해 new라는 연산자를 사용해서
//		객체(object)를 생성해야함
		Greeting greeting = new Greeting();
		greeting.greet();
		System.out.println(greeting);

	}

}
//
//class greeting{
//	public void greet() {
//		System.out.println("hi");
//	}
//}
