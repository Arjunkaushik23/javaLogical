package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> uniqueList = removeDuplicates(list);
        System.out.println(uniqueList);
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

        HashSet<Integer> hashSet = new HashSet<>(list);
        return new ArrayList<>(hashSet);
    }
}
