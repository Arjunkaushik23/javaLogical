package practicesession;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "radar";
        boolean isPalindrome = stringPalindrome(s);
        System.out.println(isPalindrome);
    }

    private static boolean stringPalindrome(String s) {

        if (s == null){
            return false;
        }

        int length = s.length();

//        int left = 0;
//        int right = s.length()-1;

//        while (left < right){
//            if(s.charAt(left) != s.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }

        for (int i = 0; i < length/2; i++) {
            if (s.charAt(i) != s.charAt(length-1-i)){
                return false;
            }
        }

        return true;
    }
}
