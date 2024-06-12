package leetcode;

public class SumArrays {
    public static void main(String[] args) {
        int[] arr = {8,6,7,2,5,3,1};
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("numbers are : " + arr[i] + " and " + arr[j]);
                    break;
                }
                    
                

            }
        }

       
        
    }
}
