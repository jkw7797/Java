public class TestCalcurator {

	public static void main(String[] args) {
		//myMethod()�� static �޼����̹Ƿ� Ŭ�����̸�. �޼��������
		//��ü�� �������� �ʰ� �ٷ� ȣ���� �� �ִ�.
		Calcurator.myMethod();
		Calcurator calc = new Calcurator();
		
		int result;
		result= calc.add(10, 20);
		System.out.printf("���ϱ� ����: %d %n", result);
		
		result = calc.sub(10, 20);
		System.out.println(result);
		
		result = calc.mul(10, 20);
		System.out.println(result);
		
		result = calc.div(10, 20);
		System.out.println(result);
		
		result = calc.mod(10, 20);
		System.out.println(result);
		
		int divRestult = calc.div(77, 3);
		System.out.printf("������ ����: %d", divRestult);
		//%s ������ %f �Ǽ��� %d ������ %n �ٹٲٱ�
	}
}