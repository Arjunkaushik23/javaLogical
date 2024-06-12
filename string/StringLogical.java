package string;

public class StringLogical {

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "cdab";


        System.out.println(canBeEqual(s1, s2));
    }

    public static boolean canBeEqual(String s1, String s2) {

        char ch[] = s1.toCharArray();
        int j = 2;
        // char ch2[] = s2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            // int j = 2;

            if ((j - i) == 2 && j<s1.length()) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                j+=1;

            }
            // else{
            //     stringBuilder.append(ch[i]);
            // }
            stringBuilder.append(ch[i]);
          
            if (stringBuilder.toString().equals(s2)) {
            return true;
        }

        }
            System.out.println(stringBuilder.toString());
        
        
            return false;

    }
}
