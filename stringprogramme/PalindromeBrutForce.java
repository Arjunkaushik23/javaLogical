package stringprogramme;

public class PalindromeBrutForce {
    public static void main(String[] args) {
        String str = "dad";
        str = str.toLowerCase();
        boolean palindrome = checkPalindrome(str);
        if (!palindrome) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    private static Boolean checkPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
