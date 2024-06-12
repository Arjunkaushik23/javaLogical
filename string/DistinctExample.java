package string;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .toList();

        System.out.println("Distinct Numbers : " + distinctNumbers);

    }
}
