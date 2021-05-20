/**
 * 
 * 1~100 사이의 값 중 하나의 값을 추측하는 게임
 * 5번 이상 시도 했는데도 못 맞추면 게임종료
 * 입력받는 값은 Scanner를 사용한다
 * 랜덤한 값 발생은 Math.random()메서드를 사용한다.
 *
 */

package guessGame;

import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		// 게임 try한 갯수
		int attempt = 1;
		// 사용자가 추측한 값
		int userGuessNumber = 0;
		// 추측해야 할 답에 해당하는 값
		int secretNumber = (int) (Math.random() * 99 + 1);
//		System.out.println(secretNumber);

		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter a guess number 1~100>");

			System.out.println();
			if (scan.hasNextInt()) {
				userGuessNumber = Integer.parseInt(scan.nextLine());
				System.out.println("입력한 값:\t" + userGuessNumber);
				if (userGuessNumber == secretNumber) {
					System.out.println("Your Number is Correct");
					break;
				} else if (userGuessNumber > secretNumber) {
					System.out.println("Down!\n");
				} else if (userGuessNumber < secretNumber) {
					System.out.println("Up!\n");
				}

				if (attempt > 4) {
					System.out.println("실패");
					System.out.println("정답:"+secretNumber);
					break;
				}
				System.out.printf("(남은횟수:%d)\n", (5- attempt));
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
