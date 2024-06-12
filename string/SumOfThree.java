package string;

import java.util.Arrays;

public class SumOfThree {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 2, 3};
        Arrays.sort(arr);
        for (int e : arr){
            System.out.println(e);
        }
        int target = 10;
        findThreeElements(arr, target);
    }

    private static void findThreeElements(int[] arr, int target) {
         //0  1  2  3  4  5
        // 1  2  3  4  5  8
        for (int i = 0; i < arr.length-2; i++) {
            int left = i+1;   // left = 1
            int right = arr.length-1;    // right = 5
            while (left < right){
                if (arr[i]+arr[left]+arr[right] == target){
                    System.out.println(STR."Numbers are : \{arr[i]} , \{arr[right]} , \{arr[left]}");
                    return;
                }else if (arr[i]+arr[left]+arr[right] < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println("No triplet found with the given target.");
    }

}
