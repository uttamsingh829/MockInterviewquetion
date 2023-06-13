package com.uk;

public class ReverseStringRecursive {

	
	    public static String reverseStringRecursive(String s) {
	        // Base case: if the string is empty or has only one character, return it
	        if (s.length() == 0 || s.length() == 1) {
	            return s;
	        }
	        // Recursive case: reverse the substring s[1:] and append s[0] to the end
	        return reverseStringRecursive(s.substring(1)) + s.charAt(0);
	    }

	    public static void main(String[] args) {
	        String myStr = "Hello, world!";
	        String reversedStr = reverseStringRecursive(myStr);
	        System.out.println(reversedStr);
	    }
	}


