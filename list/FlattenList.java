package list;

import java.util.Arrays;
import java.util.List;

public class FlattenList {

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6, 7, 8));

        List<Integer> list2 = list.stream().flatMap(List::stream).toList();

        list.stream().flatMap(List::stream).toList().forEach(System.out::println);

        // list2.forEach(System.out::println);
    }

}
