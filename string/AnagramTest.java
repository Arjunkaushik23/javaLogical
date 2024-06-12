package string;

import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "arjuna";

        boolean isAnagram = anagram(s1, s2);
        if (isAnagram){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }

    private static boolean anagram(String s1, String s2) {

        if (s1.isEmpty() || s2.isEmpty() || s1.length()!=s2.length()){
            return false;
        }

        char[] c = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c2);

        return Arrays.equals(c, c2);
    }
}
