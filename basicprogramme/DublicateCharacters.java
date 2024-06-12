package basicprogramme;

import java.util.HashMap;
import java.util.Map;

public class DublicateCharacters {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        for(char c : ch){
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()>1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
