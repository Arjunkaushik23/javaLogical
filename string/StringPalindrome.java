package string;

public class StringPalindrome {
    public static void main(String[] args) {
        String s1 = "dady";

        boolean isPalindrome = isPalindrome(s1);
        if (isPalindrome){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }

    private static boolean isPalindrome(String s1) {

        int left = 0;
        int right = s1.length()-1;

        while(left < right){
            if(s1.charAt(left) != s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
