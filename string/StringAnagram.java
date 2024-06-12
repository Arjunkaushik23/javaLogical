package string;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {

        String str1= "listen";
        String str2 = "silent";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (Character c : str1.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for (Character c : str2.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        boolean areAnagrams = map1.equals(map2);

        if (areAnagrams){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
