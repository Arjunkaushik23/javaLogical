package basicprogramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 1, 2));
        List<String> list2 = new LinkedList<>(Arrays.asList("geeks", "for", "geeks"));

        list.add(4);
        list.add(23);
        // list.stream().forEach(System.out::println);
        list.remove(1);
        list.stream().forEach(System.out::println);
        System.out.println(list2.size());

    }
}
