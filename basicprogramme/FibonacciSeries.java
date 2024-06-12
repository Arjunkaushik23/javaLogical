package basicprogramme;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int nextFib = a + b;
            System.out.print(nextFib + " ");
            a = b;
            b = nextFib;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci series: ");
        printFibonacci(n); // Output: 0 1 1 2 3
    }
}
