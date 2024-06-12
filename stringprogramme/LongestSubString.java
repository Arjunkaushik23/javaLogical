package stringprogramme;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        LongestSubString longestSubString = new LongestSubString();
        String input = "abcdbcbb";
        int longestSubStringLength = longestSubString.solutionMethod(input);
        System.out.println(longestSubStringLength);
    }

    private  int solutionMethod(String input) {
        int maxLength = 0;
        int left=0;
        int right =0;

        Set<Character> set = new HashSet<>();
       while (right < input.length()) {
        char currentChar = input.charAt(right);
        if (!set.contains(currentChar)) {
            set.add(currentChar);
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }else{
            set.remove(currentChar);
            left++;
        }
     }

     return maxLength;
    }
}
