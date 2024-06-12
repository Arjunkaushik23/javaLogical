package multithreading;

import java.util.*;

/**
 * FirstRepeating
 */
public class FirstRepeating {

   public static void main(String[] args) {
    String str = "abcabcd";
    Map<Character, Integer> map = new HashMap<>();
    
    char[] chars = str.toCharArray();
    
    for(char c : chars){
        map.put(c, map.getOrDefault(c, 0)+1);
    }
    
    for(char c : chars){
        if(map.get(c) == 1){
            System.out.println(c);
            break;
        }
    }
   }
    
}