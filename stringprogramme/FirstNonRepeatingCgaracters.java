package stringprogramme;

public class FirstNonRepeatingCgaracters {
    public static void main(String[] args) {
        String str = "abcabcd";
        char result = findFirstNonRepeatingCharacter(str);
        System.out.println(result);
    }

    private static char findFirstNonRepeatingCharacter(String str) {
        for (var ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '\0';
    }
}
