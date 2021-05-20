package datatype;

public class TestPrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수값을 저장할 수 있는 타입
		//byte, short, int, long (기본타입이 int)
		
		short n1 = 10;
		short n2 = 20;
		//기본형이 int라 short를 더해도 int로 나옴
		int result = n1 +n2;
		//Type Casting 해주어야 한ㄷ.
		short result2 = (short) (n1 +n2);
		System.out.println("result "+result);
		System.out.println("result2 "+result2);
		
		//myMethod 호출
		myMethod(10);
		myMethod(10L);
		myMethod(n1);
		
		//2. 실수값을 저장할 수 있는 타입
		//float, (>) double (기본 타입이 double)
		
		//error) 3.14는 double타입이 기본값이라 1.형변환 , 2. 뒤에 f 3.변수를 더블로 ㄱ
//		float pie = 3.14;
		float pie = (float) 3.14;
		float pie2 = 3.14f;
		double pie3 =  3.14;
		System.out.printf("pie = %.2f %n", pie);
		System.out.printf("pie = %.2f %n", pie2);
		System.out.printf("pie = %.3f %n", pie3);

		
	}//main
	
	public static void myMethod(short val) {
		System.out.println("I'm short");
	}
	
	public static void myMethod(int val) {
		System.out.println("I'm int");
	}
	
	public static void myMethod(long val) {
		System.out.println("I'm long");
	}

}
