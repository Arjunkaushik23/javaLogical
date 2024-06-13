package com.example.hackerrank;

public class PrintFibonacci {

    public static void main(String[] args) {
        int n = 10;
        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        if (n <= 0){
            System.out.println("The value of number should be greater than zero");
            return;
        }

       long[] values = new long[n];
       values[0] = 0;

       if (n > 1) {
         values[1] =1;
       }

       for (int i = 2; i < n; i++) {
         values[i] = values[i - 1] + values[i - 2];

       }

       for (int i = 0; i < n; i++) {
        System.out.println("F( " + i + " ) = " + values[i]);
       }

    }
}
