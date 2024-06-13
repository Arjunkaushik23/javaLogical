package com.example.hackerrank;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Patternregex {
    public static void main(String[] args) {
        String pattern = "([A-Z])(.+)";
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Not Valid");
        }

    }
}
