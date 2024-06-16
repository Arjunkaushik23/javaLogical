package hackerrank;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String str = "abcabcdbbosdkerwq";

        String longestSubstring = findLongestSubstring(str);
        System.out.println(
                "The longest substring without repeating characters is: " + longestSubstring);
        System.out.println("The length of the longest substring without repeating characters is:"
                + longestSubstring.length());
    }

    private static String findLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();

        int start = 0;
        int maxLength = 0;
        int longestStart = 0;

        for (int i = 0; i < str.length(); i++) {

            while (set.contains(str.charAt(i))) {

                set.remove(str.charAt(start));
                start++;
            }

            set.add(str.charAt(i));
            // maxLength = Math.max(maxLength, i-start+1);
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                longestStart = start;
            }


        }

        return str.substring(longestStart, longestStart + maxLength);
    }
}
