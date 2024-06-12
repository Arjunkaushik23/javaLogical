package string;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSetDublicate
 */
public class HashSetDublicate {

    public static void main(String[] args) {
        String string = "aabbbdddhhhggggessccddpjjhfoodbdb";
        char[] ch = string.toCharArray();
        int k = 0;
    
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }

        for (Character character : set) {
            ch[k] = character;
            k++;
        }

        for (int i = 0; i < k; i++) {
            System.out.print(ch[i]);
        }

    }

}