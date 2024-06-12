package practicesession;

public class MinimumSumSubArray {

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5, 9, 2, 6 };
        int k = 3;

        int minSubArraySum = findMinSubarraySum(nums, k);

        System.out.println("Minimum sum of a subarray of size " + k + ": " + minSubArraySum);

    }

    private static int findMinSubarraySum(int[] nums, int k) {

        int minSum = Integer.MAX_VALUE;
        int winSum = 0;

        for (int i = 0; i < k; i++) {
            winSum+=nums[i];
        }

        minSum = winSum;

        for (int i = k; i < nums.length; i++) {
            winSum += nums[i] - nums[i-k];
            minSum = Math.min(minSum, winSum);
        }

        return minSum;
    }

//    private static int findMinSubarraySum(int[] nums, int k) {
//
//        int minSum = Integer.MAX_VALUE;
//
//        for (int i = 0; i < nums.length-k; i++) {
//            int sum = 0;
//            for (int j = i; j < i+k; j++) {
//                sum += nums[j];
//            }
//            minSum = Math.min(minSum, sum);
//        }
//
//        return minSum;
//    }
}
