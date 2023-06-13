package arrayas;

import java.util.Arrays;
import java.util.List;

public class SquarNumber {

	public static void main(String[] args) {
		List<Integer> integer = Arrays.asList(1, 2, 3, 5, 6, 7);
		integer.stream().mapToInt(n -> n * n).filter(n -> n >= 100).forEach(System.out::println);

	}

}

