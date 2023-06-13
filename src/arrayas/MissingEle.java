package arrayas;

public class MissingEle {

	public static void main(String[] args) {
		int[] a= {1,3,4,5,2,6,8,9,10};
		int n = a.length+1;

		int totalSum = n*(n+1)/2;
		int remSum = 0;

		for(int i=0;i<a.length;i++){
		remSum = remSum+a[i];

		int missingNumber = totalSum-remSum;
		System.out.println(missingNumber);

	}

	}
}
