import basic.Greeting;

public class TestGreeting {
	public static void main(String[] args) {
//		Greeting.greet(); = X
//		greet Ŭ������ �޸� �÷��� ��ü������ �ؾ���
//		new Greeting(); //Greeting�̶�� Ŭ���� ȣ�� ������  �ٷδ� �ȵ�
//		Greeting�̶�� Ŭ������ ���� �޸𸮻�
//		Loading(����)�� �ϱ� ���� new��� �����ڸ� ����ؼ�
//		��ü(object)�� �����ؾ���
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
