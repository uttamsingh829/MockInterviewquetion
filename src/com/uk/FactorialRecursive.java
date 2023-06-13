package com.uk;

public class FactorialRecursive {
	
	    public static int factorial(int n) {
	        // Base case: if n is 0 or 1, the factorial is 1
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        // Recursive case: compute n * (n-1) factorial
	        return n * factorial(n-1);
	    }

	    public static void main(String[] args) {
	        int num = 5;
	        int result = factorial(num);
	        System.out.println("Factorial of " + num + " is " + result);
	    }
	}



