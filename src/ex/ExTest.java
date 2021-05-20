package ex;

public class ExTest {
	public static void main(String[] args) {
		Ex test = new Ex();
		Ex test2 = new Ex();
		
		System.out.println(test.a); //유정 / 유정
		System.out.println(test.b); //관우 / 관우
		System.out.println("+++++++++++++++++++++++++++++");
		test.a = "오세원";
		test.b = "오세원";
		
		System.out.println(test.a); //유정 /유정
		System.out.println(test.b); //세원 /관우
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println(test2.a); //유정 / 세원
		System.out.println(test2.b); //관우 / 세원
		
		
	}
}
