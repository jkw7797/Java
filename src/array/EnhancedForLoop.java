package array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);		
		int avg = (int) sum / 3;
		System.out.println("Æò±Õ : " + avg);
		
		sum = 0;
		//Enhancd For Loop »ç¿ë
		for(int i: scores) {
			sum += i;
		}
		System.out.println("ÃÑÇÕ : " + sum);
		avg = (int) sum / 3;
		System.out.println("Æò±Õ : " + avg);
	}
}