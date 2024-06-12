package practicesession;

public class AddOnlyEvenCharacters {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9,10,11,12,13,14};
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i+=2) {

                sum+=arr[i];

        }

        System.out.println(sum);
    }

}
