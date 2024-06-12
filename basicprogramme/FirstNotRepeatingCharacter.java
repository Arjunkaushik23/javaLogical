package basicprogramme;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String input = "aarrjjunn";
        char firstNonRepeating = firstNonRepeatingCharacter(input);

        if (firstNonRepeating != '\0') {
            System.out.println(firstNonRepeating);
        }else{
            System.out.println("Not Found");
        }
    }

    private static char firstNonRepeatingCharacter(String input) {
       Map<Character, Integer> map = new HashMap<>();

       for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
       }

       for (char c :input.toCharArray()) {
        if (map.get(c) == 1) {
            return c;
        }
       }
       return '\0';
    }
}
