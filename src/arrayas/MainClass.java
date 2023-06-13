package arrayas;

public class MainClass {

	
	    public static void main(String[] args) {
	        try {
	            throw new CustomException("This is a custom exception.");
	        } catch (CustomException e) {
	            System.out.println("Custom exception caught: " + e.getMessage());
	        }
	    }
	}


