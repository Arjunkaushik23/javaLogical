package practicesession;

public class Palindrome {

    public static void main(String[] args) {
        String str = "DAD";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
    }
    public static boolean checkPalindrome(String str) {
        int n= str.length();
        int left = 0;
        int right = n-1;
        while (left<right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
