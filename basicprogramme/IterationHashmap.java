package basicprogramme;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterationHashmap {
    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
        map.put('A', "Angular");
        map.put('H', "Hibernate");
        map.put('J', "Java");

        for (Map.Entry<Character, String> set : map.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }

        System.out.println("___________________________");

        Iterator<Entry<Character, String>> newIterator = map.entrySet().iterator();

        while (newIterator.hasNext()) {
            Map.Entry<Character, String> new_map = newIterator.next();

            System.out.println(new_map.getKey() + " = " + new_map.getValue());
        }

        System.out.println("__________________________________________");

        map.forEach((key, value) -> System.out.println(key + " = " + value));

        System.out.println("________________________________________________");

        map.entrySet().stream().forEach(
            input -> System.out.println(input.getKey() + " : " + input.getValue())
        );
    }

}
