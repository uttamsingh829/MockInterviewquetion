package com.uk;

public class ReverseStrin {

	public static void main(String[] args) {
	String string="Uttam";
	String string2="";
	for(int i=string.length()-1;i>=0;i--) {
		string2=string2+string.charAt(i);
	}
	System.out.println(string2);

	}

}
