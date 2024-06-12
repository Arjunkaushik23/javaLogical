package basicprogramme;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String str = "arjun";
        String str2 = "wsrfdd";

        char[] first = str.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.equals(first, second));

    }
}
