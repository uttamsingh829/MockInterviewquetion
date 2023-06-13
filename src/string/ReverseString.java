package string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Uttamsingh";
		String str1 ="";
		for (int i =  str.length()-1;i>=0; i--) {//i=6
			str1 = str1+str.charAt(i);//          str1=hgni
			
		}
		System.out.println(str1);
				
	}

}
