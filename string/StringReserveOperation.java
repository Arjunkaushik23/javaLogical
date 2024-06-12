package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReserveOperation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dacb";

        System.out.println(reverseString(s1, s2));
    }

    private static boolean reverseString(String s1, String s2) {

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i += 2) {
            list1.add(s1.charAt(i));
            list2.add(s2.charAt(i));
            
        }

        if (!isEqual(list1, list2)) {
            return false;
        }

        list1.clear();
        list2.clear();

        for (int i = 1; i < s1.length(); i += 2) {
            list1.add(s1.charAt(i));
            list2.add(s1.charAt(i));
        }

        if (!isEqual(list1, list2)) {
            return false;
        }

        return true;
    }

    private static boolean isEqual(List<Character> list1, List<Character> list2) {

        Collections.sort(list1);
        // System.out.println(list1);
        Collections.sort(list2); 
        // System.out.println(list2);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

}
