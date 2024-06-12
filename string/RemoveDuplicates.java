package string;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "kartikkaushik";

        Map<Character, Integer> map = new HashMap<>();

        StringBuilder builder = new StringBuilder();
        for (Character c : str.toCharArray()){
            if (c != ' ' && !map.containsKey(c)){
                builder.append(c);
                map.put(c,1);
            }
        }

        System.out.println(builder.toString());
    }
}
