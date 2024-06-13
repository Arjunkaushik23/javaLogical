package com.example.hackerrank;

import java.math.BigInteger;

public class Fibonacci {


    public static void main(String[] args) {
        int n = 5;
        BigInteger fib = fibonacci(n);
        System.out.println("The 500th Fibonacci number is: " + fib);
    }

    private static BigInteger fibonacci(int n) {
        
        if(n == 0) return BigInteger.ZERO;
        if(n == 1) return BigInteger.ONE;

        BigInteger prev1 = BigInteger.ZERO;
        BigInteger prev2 = BigInteger.ONE;
        BigInteger current = BigInteger.ZERO;

        for(int i = 2; i < n; i++){
            current = prev1.add(prev2);
            prev1=prev2;
            prev2=current;
        }
        return current;
    }
}
