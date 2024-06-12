package arrays;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 7, 8, 5 };
        int k = 3;

        int minSum = minSumSumArray(arr, k);
        System.out.println(minSum);
    }

    private static int minSumSumArray(int[] arr, int k) {

        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Initialize min heap with the first k elements
        for (int i = 0; i < k; i++) {
            minHeap.offer(arr[i]);
        }

        int minSum = minHeap.peek();

        // Slide the window
        for (int i = k; i < n; i++) {
            minHeap.offer(arr[i]);
            minHeap.remove(arr[i - k]); // Remove the element that's no longer in the window

            // Update minSum only if the smallest element changes
            if (minHeap.peek() != minSum) {
                minSum = minHeap.peek();
            }
        }

        return minSum;
    }
}
