package string;

import java.util.HashMap;
import java.util.Map;

public class Anagram2Test {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagram = isAnagram(s1, s2);
        if (isAnagram){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }

    private static boolean isAnagram(String s1, String s2) {

        if (s1.isEmpty() || s2.isEmpty() || s1.length()!=s2.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (char c : s2.toCharArray()){
            if (!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c, map.get(c)-1);
        }
        return true;
    }
}
