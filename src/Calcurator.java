/**
 * ��Ģ���� ����� �����ϴ� Ŭ�����Դϴ�.
 * @version v0.1
 * @author admin
 *@since 2021-05-10
 */

public class Calcurator {
	/**
	 * �ΰ��� ���� �Է����� �޾Ƽ� ���ϱ� ������ �����ϴ� �޼����Դϴ�.
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	//2���� �Է��� �޾Ƽ� ���ϱ� ������ �� ����� ��ȯ�ϴ� �޼��� ����
	public int add(int oper1, int oper2) {
		int result = oper1 + oper2;
		//�������� result
		return result;
		
	}//add
	
	/**
	 * �ΰ��� ���� �Է����� �޾Ƽ� ������ ������ �����ϴ� �޼����Դϴ�.
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
		System.out.println("���� static �޼����Դϴ�.");
		//static�� ����ϸ� �޸𸮿� ��� ������
	}
}
