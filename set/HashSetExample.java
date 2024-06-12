package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Geeks");
        set.add("for");
        set.add("Geeks");
        set.add("is");
        set.add(null);
        set.add(null);
        set.add("very helpful");
        set.add(null);

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
