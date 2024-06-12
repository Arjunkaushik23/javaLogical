package stringprogramme;

import java.util.HashMap;
import java.util.Map;

public class AnagramBychoice {

    public static void main(String[] args) {
        String str1 = "arjun";
        String str2 = "nrjua";

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }

    private static boolean isAnagram(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        return true;
    }

}
