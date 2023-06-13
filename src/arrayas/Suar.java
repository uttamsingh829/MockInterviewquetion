package arrayas;

import java.util.function.Function;

public class Suar {

	public static void main(String[] args) {
		//Suar suar= new Suar();
		//int varg=suar.getSquar(10);
		//System.out.println("Suar of the number"+varg);
		
Function<Integer, Integer> squareFunction = (n) -> n * n;
        
        // Apply the function to the number
        int squaredNumber = squareFunction.apply(10);
        
        System.out.println("Squared number: " + squaredNumber);
    }
	
//public int getSquar(int num) {
	//int varg=num *num;
	//return varg;
	
}
//}
