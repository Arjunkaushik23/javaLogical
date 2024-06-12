package string;

import java.util.HashSet;
import java.util.Set;

// import java.util.Set;

public class LongestLargerString {

    public static void main(String[] args) {
        String s1 = "abacaba";
        Set<Character> set = new HashSet<>();


        int start = 0;
        int end = 0;
        int max = 0;

        while (end < s1.length()) {

            if (set.add(s1.charAt(end))) {
                max = Math.max(max, end - start + 1);
                end++;
            } else {
                while (s1.charAt(start) != s1.charAt(end)) {
                    set.remove(s1.charAt(start));
                    start++;

                }
                set.remove(s1.charAt(start));
                start++;
                // end++;

            }
        }
        System.out.println(max);

    }

}
