package string;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitExample {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.iterate(5, n -> n + 5);

        List<Integer> limitedNumbers = numbers.limit(10)
                .collect(Collectors.toList());

        System.out.println("Limited Numbers: " + limitedNumbers);
    }
}
