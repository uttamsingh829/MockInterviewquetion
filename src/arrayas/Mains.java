package arrayas;

class Mains {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5};
        int numElements = arr.length;
        
        int result = Solution.minimumOperations(numElements, arr);
        System.out.println("Minimum operations required: " + result);
    }
}
