package array;

public class TestPrimitiveTypeArray {

	public static void main(String[] args) {
		// 배열선언
		int[] nums;
		// 배열 초기화
		nums = new int[3];

		System.out.println(nums);
		System.out.println(nums.length);
		
		printArray(nums);
		
		//for(초기치; 조건식; 증감식)
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i+1)*100;
		}
		
		printArray(nums);
		
		int[] scores = {83,90,87};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) { 
			sum += scores[i];
		}
		System.out.println(sum);
	}//main

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	
}

	