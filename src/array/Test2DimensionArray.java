package array;
import array.ArrayTest;

public class Test2DimensionArray {
	public static void main(String[] args) {
		
		//2���� �迭 ����
		int[][] scores;
		//2���� �迭 ����(2��3���� ���)
		scores = new int[2][3];
		int score = 1;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = score;
				score++;
			}
		}
		
		System.out.println(scores);
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		
		System.out.print("scores");
		ArrayTest.arrayPrint(scores);
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("[%d][%d] = %d\n",i,j,scores[i][j]);
			}//for j
		}//for i
		
		int[][] javaScores = {{95,80},{75,85,95}};
		ArrayTest.arrayPrint(javaScores);
		
		
	}//main

//	public static void arrayPrint(int[][] scores) {
//		System.out.print("\t");
//		for (int i = 0; i < scores[0].length; i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		for (int i = 0; i < scores.length; i++) {
//			System.out.print(i+"\t");
//			for (int j = 0; j < scores[i].length; j++) {
//				System.out.print(scores[i][j]+ "\t");
//			}
//			System.out.println();
//		}
//	}//arrayPrint
}//class

