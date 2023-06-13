package collection;

public class MissingElement {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 6, 7, 8, 9 ,10};
		int missingelement = 0;
		for (int i = 1; i < array.length + 1; i++) {
			missingelement += i;
			if (i <= array.length) {
				missingelement -= array[i-1];
			}
		}
		System.out.println( "MissingElement is found"+missingelement);
	}

}
