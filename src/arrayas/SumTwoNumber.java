package arrayas;

public class SumTwoNumber {

	public static void main(String[] args) {
	int input=10;
	
	int[] arr= {1,2,3,4,5,6,7,8,9};
	L:
	 for (int i = 0; i < arr.length; i++) {
		for (int j = i+1;j< arr.length; j++) {
			if ((arr[i]+ arr[j] )==input){
				System.out.println(i+" "+j);
				break L;
				
			}
			
		}
	}
			
	}

	}


