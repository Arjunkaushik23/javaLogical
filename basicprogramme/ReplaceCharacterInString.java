package basicprogramme;

public class ReplaceCharacterInString {
    public static void main(String[] args) {
        String str = "Arjun is lood boy";
        int index = 9;
        char ch = 'G';
        // System.out.println(str.substring(index + 1));
        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(str);
    }
}
