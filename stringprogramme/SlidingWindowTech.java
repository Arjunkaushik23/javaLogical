package stringprogramme;

public class SlidingWindowTech {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 7, 8, 5 };
        int k = 3;

        System.out.println("Minimum sum is : " + sum(arr, k));
    }

    private static int sum(int[] arr, int k) {

        int windowSum = 0;
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int minSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            minSum = Math.min(windowSum, minSum);
        }

        return minSum;
    }
}
