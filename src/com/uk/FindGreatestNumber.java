package com.uk;

public class FindGreatestNumber {

    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 6}; // example array

      int max=arr[0];
      for(int i=1;i<arr.length;i++) {
    	  if (arr[i]>max) {
    		  max=arr[i];
    		  
			
		}
      }
      System.err.println(max);
    }
}
