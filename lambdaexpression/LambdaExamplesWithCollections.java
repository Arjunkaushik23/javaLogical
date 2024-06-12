package lambdaexpression;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExamplesWithCollections {

    public static void main(String[] args) {

        // Filtering a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 == 0)
                .toList();
        evenNumbers.forEach(System.out::println);

        // Mapping Elements
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Arjun", "Arjuna");
        List<Integer> namesLengths = names.stream()
                .map(String::length)
                .toList();
        namesLengths.forEach(System.out::println);

        // Sorting with comparator
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");
        fruits.sort(String::compareToIgnoreCase);
        System.out.println(STR."Sorted String : \{fruits}" );

        // Grouping By
        List<String> countries = Arrays.asList("India", "USA", "UK", "Canada", "Australia");
        Map<Character, List<String>> groupByFirstLetter = countries.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(STR."Countries grouped by first letter : \{groupByFirstLetter}");

        // Combining Predicates
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Predicate<String> endsWith = s -> s.endsWith("a");
        List<String> filteredNames = names.stream()
                .filter(startsWithA.or(endsWith))
                .toList();
        System.out.println(filteredNames);

        // Calculating Average
        List<Integer> scores = Arrays.asList(80, 90, 75, 95, 85);
        double average = scores
                .stream().mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(STR."Average score: \{average}");

        // Using Optional
        Optional<String> optionalName = Optional.of("John");
        optionalName.ifPresent(name -> System.out.println(STR."Hello, \{name}"));

        // Parallel Processing
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers1.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println(STR."Sum of numbers in parallel: \{sum}");

        // Handling Exceptions
        Function<String, Integer> parseIntSafe = str -> {
            try{
                return Integer.parseInt((str));
            }catch(NumberFormatException e){
                return 0;
            }
        };

        System.out.println(STR."Parsed Number : \{parseIntSafe.apply("12345")}");
        System.out.println(STR."Parsed Invalid Number : \{parseIntSafe.apply("abcde")}");


        // using method reference
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> uppercaseWords = words.stream().map(String::toUpperCase).toList();

        System.out.println(STR."upper case List is : \{uppercaseWords}");
    }
}
