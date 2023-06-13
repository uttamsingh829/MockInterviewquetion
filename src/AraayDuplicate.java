import java.util.HashSet;
import java.util.Set;

public class AraayDuplicate {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 40, 5, 6, 70, 8, 9, 10 };
	
		        Set<Integer> set = new HashSet<Integer>();
		        Set<Integer> duplicateSet = new HashSet<Integer>();
		        for (int i = 0; i < arr.length; i++) {
		            if (!set.add(arr[i])) {
		                duplicateSet.add(arr[i]);
		            }
		        }
		        if (duplicateSet.isEmpty()) {
		            System.out.println("No duplicates found in the array.");
		        } else {
		            System.out.println("Found duplicate elements: " + duplicateSet);
		        }
		    }
		

		}
		
	


