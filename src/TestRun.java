
public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("실행 확인");
			int value=0;
			int reseult = value++;
			System.out.printf("result = %d, value = %d %n",reseult,value);
			
			value=0;
			reseult = ++value;
			System.out.printf("result = %d, value = %d",reseult,value);
	}

}
