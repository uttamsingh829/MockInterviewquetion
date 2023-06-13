
	public class MissingElement {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10};
	        int missingElement = 0;
	        
	        for (int i = 1; i <= array.length + 1; i++) {
	            missingElement += i;
	            if (i <= array.length) {
	                missingElement -= array[i-1];
	            }
	        }
	        
	        System.out.println("The missing element is: " + missingElement);
	    }
	}


