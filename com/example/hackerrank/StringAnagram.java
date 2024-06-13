package com.example.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "margana";

        boolean result = isAnagram(str1, str2);

        if (result==true) {
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String a, String b){

               
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.length() != b.length()) {
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < a.length(); i++) { 
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < b.length(); i++) {
            if (!map.containsKey(b.charAt(i))) {
                return false;
            }
            map.put(b.charAt(i), map.get(b.charAt(i)) -1);  
            
        }
       
       for(int value : map.values()) {
           if (value !=0) {
            return false;
           }
       }
       
       return true;

    }
}
