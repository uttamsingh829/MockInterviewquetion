package arrayas;

public class MissingElement {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,6,7,8,9,10};
		int temp=0;
		for (int i = 1; i < array.length+1; i++) {
			temp = temp+i;            //temp+=i;
			if (i<=array.length) {
				temp -= array[i-1];      //temp=temp-array[i-1];
			//	System.out.println("temp number is  found"+temp);
				
			}
				
		}
System.out.println("temp nuber is found"+temp);
	}

}
