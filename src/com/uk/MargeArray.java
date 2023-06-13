package com.uk;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MargeArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] a1 = { 1, 2, 3, 4 };
		int[] result=IntStream.concat(Arrays.stream(a),Arrays.stream(a1)).toArray();
		System.out.println(Arrays.toString(result));
	}

}
