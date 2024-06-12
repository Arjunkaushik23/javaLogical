package string;

public class RemoveDublicates{

    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int n = arr.length;
        int count = 0;

        int val = 3;

       System.out.println(removedublies(arr, n,count,val));

    }

    private static int removedublies(int[] arr, int n, int count, int val) {

         for (int i = 0; i <n; i++) {
            if (arr[i]!=val) {
                arr[count] =arr[i];
                count++;
            }
        }
        return count;
    }
}