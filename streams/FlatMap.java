package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("d", "e", "f"),
            Arrays.asList("g", "h", "i")
        );

        List<String> sentences = Arrays.asList("Hello world", "Java Streams", "FlatMap example");

        listOfLists.stream().flatMap(List::stream)
        .toList().forEach(System.out::print);

        System.out.println();

        List<String> collect = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" ")))
        .collect(Collectors.toList());

        collect.forEach(System.out::println);

        System.out.println("____________________________________");

        List<String[]> list = sentences.stream().map(s -> s.split(" ")).toList();
        list.forEach(System.out::println);

        System.out.println("-------------------------------------->");

        list.forEach(arr -> System.out.println(Arrays.toString(arr)));
    }
}
