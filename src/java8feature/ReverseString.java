package java8feature;

public class ReverseString {

	public static void main(String[] args) {
  String string = "Uttamsingh";
  String str ="";
  for(int i= string.length()-1;i>=0;i--) {
	  str=str+string.charAt(i);
  }
  System.out.println(str);
	}
}