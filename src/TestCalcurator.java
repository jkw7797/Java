public class TestCalcurator {

	public static void main(String[] args) {
		//myMethod()는 static 메서드이므로 클래스이름. 메서드명으로
		//객체를 생성하지 않고 바로 호출할 수 있다.
		Calcurator.myMethod();
		Calcurator calc = new Calcurator();
		
		int result;
		result= calc.add(10, 20);
		System.out.printf("더하기 값은: %d %n", result);
		
		result = calc.sub(10, 20);
		System.out.println(result);
		
		result = calc.mul(10, 20);
		System.out.println(result);
		
		result = calc.div(10, 20);
		System.out.println(result);
		
		result = calc.mod(10, 20);
		System.out.println(result);
		
		int divRestult = calc.div(77, 3);
		System.out.printf("나누기 값은: %d", divRestult);
		//%s 문자형 %f 실수형 %d 정수형 %n 줄바꾸기
	}
}