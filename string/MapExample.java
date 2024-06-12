package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<Integer> nameLength = names.stream()
                        .map(String::length)
                .collect(Collectors.toList());

        System.out.println(nameLength);
    }
}
