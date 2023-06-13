import java.util.HashSet;
import java.util.Set;

public class Array{

	public static void main(String[] args) {
		int[] arr = {1, 10, 2, 3, 7, 8, 4, 9, 20,20,2 };
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicatSet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
		if (!set.add(arr[i])) {
			duplicatSet.add(arr[i]);
		}
		}
		if (duplicatSet.isEmpty()) {
			System.out.println("Duplicate element are not found");
			
		}else {
			System.out.println("Duplicate element are found: "+duplicatSet);
		}
	}
	
}