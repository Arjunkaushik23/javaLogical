package set;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add("geeks");
        set.add("for");
        set.add("geeks");
        set.add("is");
        set.add("here");

        for (String s : set){
            System.out.println(s);
        }
    }

}
