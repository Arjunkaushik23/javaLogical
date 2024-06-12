package string;

import java.util.HashMap;
import java.util.Map;

public class Isogram {
    public static void main(String[] args) {

        String str = "arjun";
        Map<Character, Integer> map = new HashMap<>();

        boolean isIsogram = true;
        for (Character c : str.toCharArray()){
            if (map.containsKey(c)){
                isIsogram = false;
                break;
            }else{
                map.put(c,1);
            }
        }

        if (isIsogram) {
            System.out.println("Isogram");
        }else{
            System.out.println("Not Isogram");
        }
    }
}
