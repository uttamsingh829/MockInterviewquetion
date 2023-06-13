package arrayas;

public class Solution {
    static int minimumOperations(int n, int[] a) {
        int minOperations = 0;
        
        // Calculate the average of all elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int average = sum / n;
        
        // Calculate the number of operations required
        for (int i = 0; i < n; i++) {
            minOperations += Math.abs(a[i] - average);
        }
        
        return minOperations;
    }
}

