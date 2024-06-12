package basicprogramme;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReadOnlyCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 5; i++) {
            set.add(i);
        }
        set.stream().forEach(System.out::print);

        set.remove(5);
        System.out.println();

        set.stream().forEach(System.out::print);

        try {
            set = Collections.unmodifiableSet(set);
            set.remove(4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception is : " + e);
        } finally {
            System.out.println(set.contains(3));
            System.out.println("Now set is readOnly");
        }

    }

}
