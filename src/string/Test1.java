package string;

public class Test1 {

	public static void main(String[] args) {
		 String input = "*$#";//output A_B_C
		 String outputString= input.replaceAll("\\*", "A")
				 .replaceAll("\\$", "_B").replaceAll("#", "_C");
		 System.out.println(outputString);
	

	}

}
