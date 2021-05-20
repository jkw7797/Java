/**
 * 사칙연산 기능을 제공하는 클래스입니다.
 * @version v0.1
 * @author admin
 *@since 2021-05-10
 */

public class Calcurator {
	/**
	 * 두개의 값을 입력으로 받아서 더하기 연산을 수행하는 메서드입니다.
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	//2개의 입력을 받아서 더하기 연산을 한 결과를 반환하는 메서드 정의
	public int add(int oper1, int oper2) {
		int result = oper1 + oper2;
		//지역변수 result
		return result;
		
	}//add
	
	/**
	 * 두개의 값을 입력으로 받아서 나누기 연산을 수행하는 메서드입니다.
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	public int sub(int oper1, int oper2) {
		int result = oper1 - oper2;
		return result;
	}//sub
	
	public int mul(int oper1, int oper2) {
		int result = oper1 * oper2;
		return result;
	}//mul
	
	public int div(int oper1, int oper2) {
		int result = oper1 / oper2;
		return result;
	}//div
	
	public int mod(int oper1, int oper2) {
		int result = oper1 % oper2;
		return result;
	}//mod
	
	public static void myMethod() {
		System.out.println("나는 static 메서드입니다.");
		//static을 사용하면 메모리에 계속 상주함
	}
}
