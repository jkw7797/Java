
public class TimeCheaker {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//        getPrime(30000);
        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (double)(end-start)/1000 + "(s)");
	}
}
