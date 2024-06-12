package string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr= {10, 20, 10, 30, 20, 40, 10};
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){

            System.out.println("Element " + entry.getKey() + " appears " + entry.getValue() + " times.");
        }

    }

}
