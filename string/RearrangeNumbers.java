package string;

import java.util.ArrayList;
import java.util.List;

public class RearrangeNumbers {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numbers = new ArrayList<>(List.of(1, -2, 3, -4, 5, -6));
        rearrangeNumbers(numbers);
        System.out.println("Rearranged List: " + numbers);
    }

    private static void rearrangeNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : numbers){
            if (num >= 0){
                result.add(num);
            }
        }

        for (int num : numbers){
            if (num < 0){
                result.add(num);
            }
        }

        numbers.clear();
        numbers.addAll(result);

    }
}
