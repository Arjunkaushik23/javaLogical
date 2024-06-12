package multithreading;
/**
 * InnerTest
 */
@FunctionalInterface
  interface Square {

    int calculate(int x);
    static void calculate2(){
        System.out.println("This is area");
    }
    
}

public class Test {

    public static void main(String[] args) {
       int a = 5;

       Square s = (int x) -> x*x;

       int ans = s.calculate(a);

       System.out.println(ans);


    }
    
}
