//������ ��ɾ� : javac.exe HellowJava.java
//���� ��ɾ� : java.exe HelloJava "ȫ �浿" 1

public class HelloJava {
	// ������ ������ �ڹ� Ŭ������ �Ƿ��� main �ż��尡 �ݵ�� ����Ǿ� �־�� �Ѵ�.
	public static void main(String[] args) {// main = �żҵ� (String[] args) = argument/�Ķ����

		System.out.println("�ƱԸ�Ʈ ����: " + args.length);
		if (args.length == 0) {
			// �ȳ� �޼���
			System.out.println("Usages : java HelloJava �̸�");
			// ���α׷� ����
			System.exit(-1);
		} // if
		String name = args[0];
		// �ι�° argument�� 1�̰ų� 3�̸� ����, 2�̰ų� 4�̸� ����
		System.out.println(args[0]);
		System.out.println(args[1]);

		String genderStr = args[1];
		int gender = Integer.parseInt(genderStr);
		String gen;
		System.out.println("Hello " + name);
		if (gender == 1 || gender == 3) {
			System.out.println("����");
			gen = "����";
		}else if (gender == 2 || gender == 4) {
			System.out.println("����");
			gen = "����";
		}
		else {
			System.out.println("Usages : java HelloJava �̸� ����(1~4)");
			gen = "err";
			System.exit(-1);
			}

			System.out.println("Hello " + gen);

	}// main
}// class