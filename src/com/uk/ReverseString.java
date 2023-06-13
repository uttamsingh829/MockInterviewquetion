package com.uk;

public class ReverseString {

	public static void main(String[] args) {
String string="Uttamsingh";
String tempString="";
for( int i= string.length()-1;i>=0;i--) {
	tempString=tempString+string.charAt(i);
}
System.out.println(tempString);
	}

}
