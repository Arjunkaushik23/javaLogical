package basicprogramme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysToSet {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 7, 8, 7 };
        String array[] = { "Geeks", "forGeeks", "A computer Portal" };
        Set<Integer> set = new HashSet<>();

        for (Integer element : arr) {
            set.add(element);
        }


        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        Set<String> collect = Arrays.stream(array).collect(Collectors.toSet());

        Iterator iterator2 = collect.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next() + " ");
        }

        Integer size = collect.size();
        System.out.println(size);

    }
}
