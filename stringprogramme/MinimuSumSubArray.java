package stringprogramme;

public class MinimuSumSubArray {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 7, 8, 5 };
        int k = 3;
        System.out.println("Minimum subarray sum: " + findMinSubarraySum(arr, k));

    }

    private static int findMinSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            minSum = Math.min(minSum, sum);
        }

        return minSum;
    }
}
