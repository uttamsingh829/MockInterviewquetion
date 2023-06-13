package arrayas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortedArrayMultipleOperation {

	public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,4,5,78,9,0,23,5,6,7,78);
	List sortingList=list.stream().sorted().collect(Collectors.toList());
	System.out.println("sortedlist"+sortingList);
	}

}
