package basicprogramme;

public class SortString {
    public static void main(String[] args) {
        String input = "HELLO";
        String sorted = sortString(input);
        System.out.println("Origional String : " + input);
        System.out.println("Sorted String : " + sorted);
    }

    private static String sortString(String input) {

        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        return new String(chars);
    }

}
