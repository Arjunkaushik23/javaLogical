package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String str = "abcabcbb";
        LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();
        int result = solution.lengthOfLongestSubstring(str);
        System.out.println(result);
    }

    private int lengthOfLongestSubstring(String str) {

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);
            if (map.containsKey(ch)){
                start = Math.max(start, map.get(ch)+1);
            }
            map.put(ch, end);
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}
