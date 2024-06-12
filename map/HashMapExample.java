package map;

import com.sun.source.tree.LiteralTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while(iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//
//            System.out.println(STR."Key: \{key} Value: \{value}");
//        }

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Key : "+entry.getKey() + " Value : " + entry.getValue());
//        }

        System.out.println(map.values());


    }
}
