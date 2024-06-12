package practicesession;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequentCharacter {
    public static void main(String[] args) {
        String input = "   hello world is this a very time   ";
        System.out.println(input);
        input = input.replaceAll("\\s", "");
        System.out.println(input);
        char highestFrequentCharacter = highestFrequentCharacter(input);
        System.out.println("Highest Frequent Character is : " + highestFrequentCharacter);
    }

    private static char highestFrequentCharacter(String input) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c: input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        char freqChar = '\0';
        int maxFrequency = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                freqChar  = entry.getKey();
            }
        }
        return freqChar;

    }
}
