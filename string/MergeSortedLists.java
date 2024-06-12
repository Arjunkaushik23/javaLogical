package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedLists {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 7));
        java.util.ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 4, 6, 8));

        ArrayList<Integer> mergeList = mergeSortedList(list1,list2);
        System.out.println("Merge List is : " + mergeList);
    }

    private static ArrayList<Integer> mergeSortedList(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> mergeList = new ArrayList<>(list1);
        mergeList.addAll(list2);

        Collections.sort(mergeList);
        return mergeList;
    }
}
