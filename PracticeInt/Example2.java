package PracticeInt;

import java.util.*;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
//        Given a list of integers, find out all the
//        even numbers that exist in the list using Stream functions?

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
//        list.add(null);
        list.add(50);
        list.add(55);

//        list.stream().filter(n->n%2 == 0).forEach(System.out::println);

        Optional<Integer> optional;


//        we have a list of strings and we want to group them by their length.

        List<String> list2 = new ArrayList<>();
        list2.add("arjun");
        list2.add("kaushik");
        list2.add("anuj");
        list2.add("arun");
        list2.add("abhishek");

//        List<Integer> list1 = list2.stream().map(s -> s.length()).toList();
//        System.out.println(list1);

      list2.stream().collect(Collectors.groupingBy(String::length))

                .forEach((length, group) ->{
        //     System.out.println(STR."Length : \{length} : \{group}");
        });
    }

}
