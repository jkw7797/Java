/* 
 * 아규먼트 2개를 받아서 사칙연산 하기
 * java MyCalc 20 10
 */
public class MyCalc {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Java MyCalc 20 10");
			System.exit(-1);
		}
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
//		
//		String operStr1 = args[0];
//		String operStr2 = args[1];
//		int oper1 = Integer.parseInt(operStr1);

		int plus = x + y;
		int minus = x - y;
		int multiply = x * y;
		int divide = x / y;
		int remainder = x % y;

		System.out.println(x + "\t+\t" + y + "\t=\t" + plus);
		System.out.println(x + "\t-\t" + y + "\t=\t" + minus);
		System.out.println(x + "\t*\t" + y + "\t=\t" + multiply);
		System.out.println(x + "\t/\t" + y + "\t=\t" + divide);
		System.out.println(x + "\t%\t" + y + "\t=\t" + remainder);
	}

}
