package string;

public class LastWord {

    public static void main(String[] args) {
        String s1 = "  Fly to  the   moon  ";
        String s2 = s1.trim();
        // String substr = "";
        StringBuilder stringBuilder = new StringBuilder();

        // System.out.println(s2);

        for (int i = s2.length()-1; i >= 0; i--) {
            if(s2.charAt(i) == ' '){
                 stringBuilder.append(s2.charAt(i));
                 break;
            }
        }

        System.out.println(stringBuilder);
    }
    
}
