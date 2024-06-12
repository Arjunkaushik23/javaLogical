package string;

import java.util.stream.Collectors;

public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // To print an arrayList
        System.out.println(list);

        list.remove(0);

        System.out.println(list.toString());

        list.forEach(System.out::print);

//        Integer result = list.stream().collect(Collectors.joining(1));

    }
}
