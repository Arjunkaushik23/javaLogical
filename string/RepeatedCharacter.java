package string;


public class RepeatedCharacter {

    public static void main(String[] args) {
        String str = "abca";
        char solution = findRepeatedCharacter(str);
        System.out.println(solution);
    }

    public static char findRepeatedCharacter(String str) {
        boolean[] found = new boolean[26];
        for (char c : str.toCharArray()) {
            int index = c-'a';
            if (found[index]){
                return c;
            }
            found[index] = true;
        }

        return '\0';

    }

}
