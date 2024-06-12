package arrays;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
    
            int[] arr = {4,2,3,5,1,2,3};
            int k = 3;
        
            int minSum = minSumSumArray(arr, k);
            System.out.println(minSum);
    }
        private static int minSumSumArray(int[] arr, int k) {
          
            int winSum = 0;
            int n = arr.length;

            for (int i = 0; i < k; i++) {
                winSum += arr[i];
            }

            int sum = winSum;

            for (int i = k; i < n; i++) {
                winSum += arr[i] - arr[i-k];
               sum =  Math.min(sum, winSum);
            }

            return sum;
        }
}
