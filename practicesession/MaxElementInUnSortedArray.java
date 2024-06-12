package practicesession;

public class MaxElementInUnSortedArray {

    public static void main(String[] args) {
        int[] numbers = { 10, 30, 5, 40, 20 };

        int maxElement = findMax(numbers);

        System.out.println("Maximum element in the array: " + maxElement);

    }

    private static int findMax(int[] numbers) {

        if (numbers == null || numbers.length == 0){
            throw new IllegalStateException("Array cannot be null or empty");
        }

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }
}
