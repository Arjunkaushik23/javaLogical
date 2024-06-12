package stringprogramme;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {

            int count = map.getOrDefault(ch, 0);
            if (count == 0) {
                return false;
            } else {
                map.put(ch, count - 1);
            }
            
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String str1 = "ebacdabc";
        String str2 = "abcdecba";

        System.out.println(areAnagram(str1, str2));
    }

}
