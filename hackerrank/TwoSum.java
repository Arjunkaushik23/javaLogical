package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1,4,8,3,4,8,12,15,13};
        int target = 16;

        List<int[]> result = getElements(array, target);

        for (int[] is : result) {
            System.out.println("pairs : " + is[0] + " , " + is[1]);
        }
    }

    private static List<int[]> getElements(int[] array, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if (map.containsKey(complement)) {
                result.add(new int[] {map.get(complement), i});
            }
           
            map.put(array[i], i);

        }
        

        return result;
    }
}
