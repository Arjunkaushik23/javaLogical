package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceElement {
    public static void main(String[] args) {
        String str = "abbacccdefddddddd";

        char c = maximum(str); 
        System.out.println(c);
    }

    public static char maximum(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();

        for(char c : arr){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Map.Entry<Character, Integer> entry = map.entrySet().iterator().next();
        // for(Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
            
        // }

        char maxChar = '\0';
        int maxCount = 0;


    


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }
}


