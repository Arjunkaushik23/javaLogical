package com.example.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {
    public static void main(String[] args) {
        String str = "He is very very very good boy isn't he?";
        String regex = "[A-Za-z]+";

        // print the token that how many time you broke it out
        int token = 0;
        // print the new string which follows this pattern

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
            token++;
        }

        System.out.println(token);
    }
}
