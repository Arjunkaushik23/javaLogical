package string;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Set<Integer> evenNumbers = numbers.stream().filter(num->num%2==0).collect(Collectors.toSet());
        System.out.println(evenNumbers);

        numbers.forEach(System.out::println);

        System.out.println("_________________________________________________________");

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
