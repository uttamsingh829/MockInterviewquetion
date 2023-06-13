package arrayas;

import java.util.Arrays;

public class FindTheMaxNumberUsingJava8 {

	public static void main(String[] args) {
		int[] nums = {4, 2, 7, 1, 9, 5};

		// Find the maximum element in the array
		int maxNum = Arrays.stream(nums).max().orElse(0);

		System.out.println("The maximum number is: " + maxNum);

	}

}
