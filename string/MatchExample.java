package string;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean anyMatch = numbers.stream().anyMatch(num -> num > 5);
        boolean allMatch = numbers.stream().allMatch(num -> num > 1);
        boolean noneMatch = numbers.stream().noneMatch(num -> num > 4);

        System.out.println("Any Match (>3): " + anyMatch);
        System.out.println("All Match (>0): " + allMatch);
        System.out.println("None Match (>5): " + noneMatch);
    }
}
