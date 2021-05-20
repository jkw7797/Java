package array;

public class ArrayTest {
	public static void arrayPrint(int[][] scores) {
		System.out.print("\t");
		for (int i = 0; i < scores[0].length; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i+"\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}
