package string;

public class StringOccurrences {
	
	    public static void main(String[] args) {
	        String text = "hello ";
	        String substring = "hello";
	        int count = text.split(substring, -1).length - 1;
	        
	        System.out.println("The number of occurrences of \"" + substring + "\" is: " + count);
	    }
	}


