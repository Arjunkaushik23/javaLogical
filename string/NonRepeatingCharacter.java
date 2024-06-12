package string;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        char firstNonRepeatedCharacter = '\0';
        for (Character c : str.toCharArray()){
            if (map.get(c)==1){
                firstNonRepeatedCharacter = c;
                break;
            }
        }

        if (firstNonRepeatedCharacter != '\0'){
            System.out.println("First non repeated character is : " + firstNonRepeatedCharacter);
        }else{
            System.out.println("No non repeated character found");
        }



    }
}
