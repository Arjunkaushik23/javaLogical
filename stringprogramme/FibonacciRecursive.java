package stringprogramme;

public class FibonacciRecursive {
    public static void main(String[] args) {
        // int n = 10;

        // int a = 0;
        // int b =1;

        // System.out.println("series of "+n+" is   : ");
        // for (int i = 0; i < n; i++) {
        //   System.out.print(a + " ,");
        //     int nextTerm = a + b;
        //     a=b;
        //     b= nextTerm;

        // }
        int n= 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i) + " ,");
        }

    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
