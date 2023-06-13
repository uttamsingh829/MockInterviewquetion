package arrayas;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceExample {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,3,4,4,4,4,5,5,6};

        // Group the elements by their values and count their occurrences
        Map<Integer, Long> occurrenceMap = Arrays.stream(a)
            .boxed()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // Print the occurrence of each element
        occurrenceMap.forEach((key, value) -> System.out.println(key + " occurs " + value + " times"));
    }
}
