package string;

import java.util.HashMap;
import java.util.Map;

public class SumOfThreeDigits {
    public static void main(String[] args) {
        int[] digits = {1, 4, 5, 8, 2, 3};
        int target = 10;
        findThreeElements(digits, target);
    }

    private static void findThreeElements(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int remainingSum = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int pairSum = nums[i] + nums[j];
                if (map.containsKey(pairSum)) {
                    System.out.println("Elements found: " + nums[i] + ", " + nums[j] + ", " +
                            map.get(pairSum));
                    return; // Exit after finding the first valid triplet
                }
                map.put(remainingSum - nums[j], nums[j]); // Store the difference in the map
            }
        }
        System.out.println("No triplet found with the given target.");
    }
}
