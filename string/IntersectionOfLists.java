package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(3, 4, 5, 6, 7));

        ArrayList<Integer> intersection =  intersectionOfList(list1, list2);
        System.out.println(intersection);

    }

    private static ArrayList<Integer> intersectionOfList(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }
}
