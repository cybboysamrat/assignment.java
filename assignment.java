public class MaxDifference {
    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};
        int maxDifference = findMaxDifference(arr);
        System.out.println("Largest difference: " + maxDifference);
    }
    
    public static int findMaxDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Not enough elements to calculate a difference
        }
        
        int maxDifference = 0;
        int minElement = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            maxDifference = Math.max(maxDifference, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }
        
        return maxDifference;
    }
}
