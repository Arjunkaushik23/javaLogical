package practicesession;

import java.util.Arrays;

public class GetTheSumOfElements {

    public static void main(String[] args) {
//        abc-array = 1,2,3,4,5,7,8,9
//        target = 20
//        a+b+c = target
//        Find the values of a,b,c

        int [] arr = {1,2,3,4,5,7,8,9};
        int target = 20;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int a = arr[left];
            int b = arr[right-1];
            int c = arr[right];

            int sum = a+b+c;

            if (sum == target){
                System.out.printf("a=%d, b=%d, c=%d%n", a, b, c);
                return;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("No Solution Found for Target");
    }
}
