package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "kartik";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()){
            if (ch!=' '){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }

        System.out.println("Duplicate characters in the string : ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
