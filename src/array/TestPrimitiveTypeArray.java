package array;

public class TestPrimitiveTypeArray {

	public static void main(String[] args) {
		// �迭����
		int[] nums;
		// �迭 �ʱ�ȭ
		nums = new int[3];

		System.out.println(nums);
		System.out.println(nums.length);
		
		printArray(nums);
		
		//for(�ʱ�ġ; ���ǽ�; ������)
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

	