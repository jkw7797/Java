package datatype;

public class TestPrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� ������ �� �ִ� Ÿ��
		//byte, short, int, long (�⺻Ÿ���� int)
		
		short n1 = 10;
		short n2 = 20;
		//�⺻���� int�� short�� ���ص� int�� ����
		int result = n1 +n2;
		//Type Casting ���־�� �Ѥ�.
		short result2 = (short) (n1 +n2);
		System.out.println("result "+result);
		System.out.println("result2 "+result2);
		
		//myMethod ȣ��
		myMethod(10);
		myMethod(10L);
		myMethod(n1);
		
		//2. �Ǽ����� ������ �� �ִ� Ÿ��
		//float, (>) double (�⺻ Ÿ���� double)
		
		//error) 3.14�� doubleŸ���� �⺻���̶� 1.����ȯ , 2. �ڿ� f 3.������ ����� ��
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
