package stringprogramme;

public class ReverseString {
    public static void main(String[] args) {
        String str = "arjun";
        String str2 = "";
        // StringBuilder reverse = new StringBuilder();.
        for (int i = str.length()-1; i >= 0; i--) {
           str2+=str.charAt(i);
        }

        System.out.println(str2);
    }
}
