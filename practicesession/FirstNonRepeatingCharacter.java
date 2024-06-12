package practicesession;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "abcabcabcd";
        char firstNotRepeatingChar = firstNonRepeatingCharacter(input);
        if (firstNotRepeatingChar == '\0'){
            System.out.println("Not found");
        }
        System.out.println("First non repeating character is : " + firstNotRepeatingChar);
    }

    private static char firstNonRepeatingCharacter(String input) {

        if (input == null || input.isEmpty()){
            throw new IllegalArgumentException("Input String cannot be null or empty");
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (char c : input.toCharArray()){
            if (map.get(c) == 1){
                return c;
            }

        }

        return '\0';
    }
}
