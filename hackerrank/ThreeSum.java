package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 3, 8, 4};

        int target = 16;

        List<int[]> sum = getTriplets(arr, target);

        for (int[] i : sum) {
            
            
            System.out.println("pair : " + i[0] + " , " + i[1] + " , " + i[2]);
        }
    }

    private static List<int[]> getTriplets(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    if (arr[i] + arr[j] + arr[j2] == target) {
                        result.add(new int[] {arr[i], arr[j], arr[j2]});
                    }
                }
            } ---
        }
        return result;
        
    }
   

}
