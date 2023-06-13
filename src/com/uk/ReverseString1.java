package com.uk;

public class ReverseString1 {
	private String reverse( final String name) {
		if (name==null||name.isEmpty()) {
			return name;
		}
		String reverse="";
		for(int i= name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		ReverseString1 rString1 =new ReverseString1();
		String name =rString1.reverse("uttam");
		System.out.println(name);
	}
	
	
	

}
