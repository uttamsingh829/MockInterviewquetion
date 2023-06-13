package arrayas;

import java.security.PublicKey;

public class MyException extends RuntimeException{
}
		 class SetText{
			 public static void main(String[] args) 
			 {
			
				
			try {throw  new MyException();
				
			} catch (MyException ex) 
			{
				System.out.println("Caought");
				System.out.println(ex.getMessage());
			}
		
	}
		 }

