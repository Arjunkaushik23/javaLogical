package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Streams {

    public static void main(String[] args) {

        // Match functions:

        List<String> streamList = Arrays.asList("akjun", "kartik", "kaushik");

        boolean matches = streamList
                .stream()
                // .anyMatch((value) ->
                // .allMatch((value) ->
                .noneMatch((value) -> {
                    return value.startsWith("ar");
                });

        System.out.println(matches);

        // Collect Method :

        List<String> streamList2 = Arrays.asList("akjun", "kartik", "kaushik");

        streamList2
                .stream()
                // .map(value -> value.toUpperCase())
                .map(value -> value.toLowerCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // count function :

        List<String> streamList3 = Arrays.asList("arjun", "kartik", "kaushik");

        long count = streamList3
                .stream()
                .map(value -> value.toUpperCase())
                .count();

        System.out.println(count);

        // findAny method:

        List<String> streamList4 = Arrays.asList("john", "akjun", "kartik", "kaushik");

        int length = streamList4
                .stream()
                .findFirst()
                .get().length();
        // .map(value -> value.length()).collect(Collectors.toList());
        // .findAny();

        System.out.println(length);

        // min-max method :

        List<String> streamList5 = Arrays.asList("arjun", "kartik", "kaushik");

        String string = streamList5
                .stream()
                // .min((value1, value2) -> {
                .max((value1, value2) -> {
                    return value1.compareTo(value2);
                })
                .get();

        System.out.println(string);

        // reduce method :

        List<String> streamList6 = Arrays.asList("arjun", "kartik", "kaushik");
        String string2 = streamList6
                .stream()
                .reduce((value, combinedValue) -> {
                    return combinedValue + " , " + value;
                })
                .get();

        System.out.println(string2);

        // toArray Method:

        List<String> streamList7 = Arrays.asList("arjun", "kartik", "kaushik");

        Object[] array = streamList7
                .stream()
                .toArray();

        for (Object object : array) {
            System.out.println(object);
        }

        // Terminal Operation :

        // filter method:

        List<String> streamList8 = Arrays.asList("arjun", "kartik", "kaushik");

        List<String> filterList = streamList8
                .stream()
                .filter(line -> !"arjun".equals(line))
                .toList();

        filterList.forEach(System.out::println);

        // map method

        List<String> streamList9 = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> mapList = streamList9.stream()
                .map(Integer::valueOf)
                .toList();

        System.out.println(mapList);

        // flatMap method

        List<String> list1 = Arrays.asList("arjun", "kartik", "kaushik");
        List<String> list2 = Arrays.asList("arjun", "kartik", "kaushik");
        List<String> list3 = Arrays.asList("arjun", "kartik", "kaushik");

        List<String> outputList = Stream
                .of(list1, list2, list3)
                .flatMap(list -> list.stream())
                .toList();

        System.out.println("Flattened list: " + outputList);

        // distinct method

        List<String> streamList11 = Arrays.asList("one", "two", "three", "four", "one");
        List<String> distinctList = streamList11
                .stream()
                .distinct()
                .toList();

        System.out.println(distinctList);

        // limit method

        streamList11.stream().limit(2).forEach(System.out::println);

        // peak method

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value : " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value : " + e))
                .toList();

        String[] arr = new String[] { "a", "b", "c", "d" };
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(System.out::println);

        Stream<String> streamOfArrayPart = Arrays.stream(arr, 0, 4);
        streamOfArrayPart.forEach(System.out::println);

        
    }

}
