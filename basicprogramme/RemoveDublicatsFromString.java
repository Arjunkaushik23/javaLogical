package basicprogramme;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicatsFromString {
    public static void main(String[] args) {
        String input = "hello world";
        String withoutDublicates = removeDublicates(input);
        System.out.println(withoutDublicates);
    }

    private static String removeDublicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> uniqueCharacters = new LinkedHashSet<>();
        for (char character : str.toCharArray()) {
            uniqueCharacters.add(character);
        }

        StringBuilder result = new StringBuilder();
        for (char character : uniqueCharacters) {
            result.append(character);
        }

        return result.toString();

    }
}
