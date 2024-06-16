package hackerrank;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {10, 12, 12, 58, 67, 95, 78, 55};

        int secondLargestNumber = SecondLargestNumber(arr);
        System.out.println(secondLargestNumber);


    }

    private static int SecondLargestNumber(int[] arr) {

        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }

           
        }
        return secondLargest;
    }
}
