package multithreading;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {


    public static void main(String[] args) {
        String str = "abcabcd";

        char[] chars = str.toCharArray();

        char firstNonRepeationCharacter = nonRepeationChacter(chars);
        if (firstNonRepeationCharacter == '\0') {
            System.out.println("No non repeation chaaracter found");
        } else {
            System.out.println("First non repeating character is : " + firstNonRepeationCharacter);
        }

    }

    private static char nonRepeationChacter(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        for (char ch : chars) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }
}
