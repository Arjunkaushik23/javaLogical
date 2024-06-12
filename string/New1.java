package string;

public class New1 {
    public static void main(String[] args) {
        String s1 = "kina";
        String s2 = "kina";

        System.out.println(reverseString(s1, s2));
    }

    private static boolean reverseString(String s1, String s2) {

        char ch[] = s1.toCharArray();
        char ch2[] = s1.toCharArray();
        char ch3[] = s1.toCharArray();


        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();

        int j = 2;
        int k = 3;
        int l = 2;

        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        if(s1.equals(s2)){
            return true;
        }

        
        for (int i = 0; i < s1.length(); i++) {

            if (j < s1.length()) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                j++;
            }

        }
        stringBuilder.append(ch);
        System.out.println(stringBuilder);
        if (stringBuilder.toString().equals(s2)) {
            return true;
        }

        for (int i = 1; i < s1.length(); i += 2) {

            if (k < s1.length()) {
                // System.out.println(k);
                char temp2 = ch2[i];
                ch2[i] = ch2[k];
                ch2[k] = temp2;
                k += 2;

            }
        }
        stringBuilder2.append(ch2);
        System.out.println(stringBuilder2);
        if (stringBuilder2.toString().equals(s2)) {
            return true;
        }

        for (int i = 0; i < s1.length(); i +=2) {

            if (l < s1.length()) {
                // System.out.println(k);
                char temp2 = ch3[i];
                ch3[i] = ch3[l];
                ch3[l] = temp2;
                l += 2;

            }
        }
        stringBuilder3.append(ch3);
        System.out.println(stringBuilder3);
        if (stringBuilder3.toString().equals(s2)) {
            return true;
        }

        return false;

    }
}
