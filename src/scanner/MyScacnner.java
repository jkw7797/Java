package scanner;

import java.util.Scanner;

public class MyScacnner {

	public static void main(String[] args) {
		// 1. Scanner ��ü ����
		//InputStream = System.in
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����� �̸���: ");
		String name = scan.next();
		
		System.out.println(name+"�� ȯ���մϴ�.");
		System.out.println("������ �ش��ϴ� ���ڸ� �Է��ϼ���.");
		int gender = scan.nextInt();
		if (gender ==1 || gender == 3) {
			System.out.println("�����Դϴ�.");
		}
		if (gender ==2 || gender ==4) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ش��ϴ� ���ڰ��� �ƴմϴ�.");
		}
		
		//scanner �ݱ�
		scan.close();
	}

}
