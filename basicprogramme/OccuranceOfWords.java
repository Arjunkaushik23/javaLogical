package basicprogramme;

import java.util.HashMap;
import java.util.Map;

/**
 * OccuranceOfWords
 */
public class OccuranceOfWords {

    public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";
        String[] words = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer integer = map.get(word);
            if (integer == null) {
                map.put(word, 1);
            } else {
                map.put(word, integer + 1);
            }
        }
        System.out.println(map);

        Map<String, Integer> map2 = new HashMap<>();

        for (String word : words) {
            // containsKey(key) will return a boolean value
            // i.e. true if it contains the key and false if
            // it doesn't.
            if (map2.containsKey(word))
            map2.put(word, map2.get(word) + 1);
 
            else
            map2.put(word, 1);
        }
 
        System.out.println(map2);
    }
    }
