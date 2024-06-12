package arrays;

public class MinimumSumSubArray {
   public static void main(String[] args) {
    int[] arr = {4,2,3,5,1,2,3};
    int k = 3;

    int minSum = minSumSumArray(arr, k);
    System.out.println(minSum);
   }

private static int minSumSumArray(int[] arr, int k) {

    int n = arr.length;
    int minSum = Integer.MAX_VALUE;

    for(int i = 0; i <= n-k ; i++){
        int sum = 0;
        for (int j = i; j < i+k; j++) {
            sum += arr[j];
        }

       minSum = Math.min(minSum, sum);

    }

    return minSum;
}
    
}
