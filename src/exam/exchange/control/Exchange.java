package exam.exchange.control;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.println(">�� ��������:\t(0�� �Է��ϸ� ����)");
			int money = scan.nextInt();
			switch (money) {
			case 0:
				System.out.println("����");
				a=false;
				break;
			default:
				int ex_money;
				String unit = "��";
				if (money < 1200) {
					ex_money = money * 1200;
					unit = "��";
				} else {
					ex_money = (int) ((double) money / 1200);
					unit = "�޷�";
				}
				System.out.printf("ȯ��: %d%s\n",ex_money,unit);
				break;
			}
		}

	}
}
