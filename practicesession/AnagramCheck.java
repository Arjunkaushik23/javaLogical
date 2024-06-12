package practicesession;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "sileat";

        boolean areAnagram = AreAnagram(s1, s2);
        if (areAnagram) {
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }

    private static boolean AreAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }


        for (Character c : s2.toCharArray()){
            int count = map.getOrDefault(c,0);
            if (count == 0){
                return false;
            }
            map.put(c, count-1);
        }

        for (int count : map.values()){
            if (count !=0){
                return false;
            }
        }
        return true;
    }
}
