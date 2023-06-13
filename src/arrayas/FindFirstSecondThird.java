package arrayas;

import java.util.Arrays;

public class FindFirstSecondThird {

	public static void main(String[] args) {
		int[] nums = {4, 2, 7, 1, 9, 5};
		//find the min value in the arrray
		int minNum = Arrays.stream(nums).min().orElse(0);
				System.out.println("The minimum number is: " + minNum);
		// Find the max value in the array
		        int max = Arrays.stream(nums).max().orElse(-1);
		        System.out.println("The maximum number is: " + max);
	 
		        // Find the second highest value in the array
		                      int secondMax = Arrays.stream(nums)
		                      .filter(num -> num != max)
		                      .max()
		                      .orElse(-1);
		System.out.println("The second highest number is: " + secondMax);

		// Find the third highest value in the array
		int thirdMax = Arrays.stream(nums)
		                     .filter(num -> num != max && num != secondMax)
		                     .max()
		                     .orElse(-1);

		System.out.println("The third highest number is: " + thirdMax);

	}

}
