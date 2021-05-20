/**
 * 
 * 1~100 ������ �� �� �ϳ��� ���� �����ϴ� ����
 * 5�� �̻� �õ� �ߴµ��� �� ���߸� ��������
 * �Է¹޴� ���� Scanner�� ����Ѵ�
 * ������ �� �߻��� Math.random()�޼��带 ����Ѵ�.
 *
 */

package guessGame;

import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		// ���� try�� ����
		int attempt = 1;
		// ����ڰ� ������ ��
		int userGuessNumber = 0;
		// �����ؾ� �� �信 �ش��ϴ� ��
		int secretNumber = (int) (Math.random() * 99 + 1);
//		System.out.println(secretNumber);

		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter a guess number 1~100>");

			System.out.println();
			if (scan.hasNextInt()) {
				userGuessNumber = Integer.parseInt(scan.nextLine());
				System.out.println("�Է��� ��:\t" + userGuessNumber);
				if (userGuessNumber == secretNumber) {
					System.out.println("Your Number is Correct");
					break;
				} else if (userGuessNumber > secretNumber) {
					System.out.println("Down!\n");
				} else if (userGuessNumber < secretNumber) {
					System.out.println("Up!\n");
				}

				if (attempt > 4) {
					System.out.println("����");
					System.out.println("����:"+secretNumber);
					break;
				}
				System.out.printf("(����Ƚ��:%d)\n", (5- attempt));
				System.out.print("Enter a guess number 1~100>");
			} else {
				System.out.println("Enter a Valid Integer Number");
				break;
			}
			attempt++;
		} while (userGuessNumber != secretNumber);
		scan.close();
	}
}
