import java.util.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		  int[] arr = {5, 3, 9, 1, 7, 2};
	        int min = Arrays.stream(arr).min().getAsInt();
	        int max = Arrays.stream(arr).max().getAsInt();

	        System.out.println("Minimum element in the array: " + min);
	        System.out.println("Maximum element in the array: " + max);

	}

}
