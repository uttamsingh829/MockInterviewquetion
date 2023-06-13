import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArray {

	public static void main(String[] args) {
	int[] arr= {1,7,8,5,9,3,8,6,4,3,2,0,2,};
	Set<Integer> set= new HashSet<Integer>();
	Set<Integer> duplicatSet=new HashSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
	if (!set.add(arr[i])) {
		duplicatSet.add(arr[i]);
	}
	}
	if(duplicatSet.isEmpty()) {
		
	System.out.println("Duplicate number is not fount");
	}else {
			System.out.println("Duplicate number is found:"+duplicatSet);
		}
	
	}
	}
