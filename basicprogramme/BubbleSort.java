package basicprogramme;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        bubbleSort(numbers);
        System.out.println("Sorted Array : " + Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
