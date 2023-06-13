package arrayas;

import java.util.Arrays;

public class FindArraySecond {

	public static void main(String[] args) {
		int[] nums = {4, 2, 7, 1, 9, 5};

		// Find the max value in the array
		int max = Arrays.stream(nums).max().orElse(0);

		// Find the second highest value in the array
		int secondHighest = Arrays.stream(nums)
		                          .filter(num -> num != max)
		                          .max()
		                          .orElse(0);

		System.out.println("The second highest number is: " + secondHighest);


	}

}
