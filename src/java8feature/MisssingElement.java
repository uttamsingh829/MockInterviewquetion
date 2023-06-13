package java8feature;

public class MisssingElement {

	public static void main(String[] args) {
		int[] array= {1,2,4,5,6,7,8,9};
		 int temp=0;
		 for(int i=1;i<array.length+1;i++) {
			 temp= temp+i;
			 if (i<array.length) {
				 temp=temp-array[i-1];
				
			}
		 }
		 System.out.println(temp);

	}

}
