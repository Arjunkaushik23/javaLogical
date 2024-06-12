package basicprogramme;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "Hello World Java Programming";
        String reversedWords = reverseWords(input);
        System.out.println("Reversed words: " + reversedWords);
    }

    private static String reverseWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split(" ");

        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]).append(" ");
        }

        return reverse.toString().trim();
    }
}
