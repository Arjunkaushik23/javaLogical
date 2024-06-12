package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

//        names.sort(String::compareTo);
//        Collections.sort(names);
//        Collections.sort(names, (name1, name2)-> name1.compareTo(name2));
        Collections.sort(names,String::compareTo);
        System.out.println("Sorted names : " + names);
    }
}
