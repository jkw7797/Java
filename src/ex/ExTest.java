package ex;

public class ExTest {
	public static void main(String[] args) {
		Ex test = new Ex();
		Ex test2 = new Ex();
		
		System.out.println(test.a); //���� / ����
		System.out.println(test.b); //���� / ����
		System.out.println("+++++++++++++++++++++++++++++");
		test.a = "������";
		test.b = "������";
		
		System.out.println(test.a); //���� /����
		System.out.println(test.b); //���� /����
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println(test2.a); //���� / ����
		System.out.println(test2.b); //���� / ����
		
		
	}
}
