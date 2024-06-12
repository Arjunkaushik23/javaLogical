package stringprogramme;

import java.util.Arrays;

public class AnagramBruteForce {
    public static void main(String[] args) {
        String str = "listen";
        String str2 = "silent";
        boolean areAnagram = areAnagram(str, str2);
        System.out.println("Are \"" + str + "\" and \"" + str2 + "\" anagrams? " + areAnagram);

    }

    private static boolean areAnagram(String str, String str1) {

        str = str.toLowerCase().replaceAll("\\s", "");
        str1 = str1.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str1.length()) {
            return false;
        }

        char[] charArray = str.toCharArray();
        char[] charArray2 = str1.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray, charArray2);
    }
}
