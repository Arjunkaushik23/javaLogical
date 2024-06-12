package string;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "abdceb";
        char ch = firstRepeatedCharacter(str);
        System.out.println(ch);
    }

    private static char firstRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
            if (map.get(c) > 1){
                return c;
            }
        }

        return '\0';
    }
}
