package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numbers = new ArrayList<>(List.of(5, 2, 7, 3, 9));
        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second Largest Element: " + secondLargest);
    }

//                     First Approach :- By Sorting the elements


//    private static int findSecondLargest(ArrayList<Integer> numbers) {
//        Collections.sort(numbers);
//        int size = numbers.size();
//
//        if (size < 2){
//            return -1;
//        }
//        return numbers.get(size-2);
//    }

//                       Second Approach :- Without Sorting elements


    private static int findSecondLargest(ArrayList<Integer> numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }

}
