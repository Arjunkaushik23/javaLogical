package stringprogramme;

import java.util.HashMap;
import java.util.Map;

public class AreAnagramOptimised {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = areAnagramsOptimized(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagrams);
    }

    private static boolean areAnagramsOptimized(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : array1) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char c : array2) {
            int count = map.getOrDefault(c,0);
            if (count == 0){
                return false;
            } 
            map.put(c, count-1);
        }

        for (int c : map.values()) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
