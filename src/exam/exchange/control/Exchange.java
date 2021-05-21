package exam.exchange.control;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.println(">돈 넣으세요:\t(0을 입력하면 종료)");
			int money = scan.nextInt();
			switch (money) {
			case 0:
				System.out.println("ㅂㅂ");
				a=false;
				break;
			default:
				int ex_money;
				String unit = "원";
				if (money < 1200) {
					ex_money = money * 1200;
					unit = "원";
				} else {
					ex_money = (int) ((double) money / 1200);
					unit = "달러";
				}
				System.out.printf("환전: %d%s\n",ex_money,unit);
				break;
			}
		}

	}
}
