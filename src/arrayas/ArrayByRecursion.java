package arrayas;

public class ArrayByRecursion {

		static void printNumber(int a) {
			if (a>1) {
				printNumber( a-1);
			}
			System.out.println(a);
		}
		public static void main(String[] args) {
        printNumber(10);
	}

}
