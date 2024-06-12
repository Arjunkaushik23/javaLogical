package string;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try {
            int result = divide(10,2);
            System.out.println("Result: " + result);
        }catch(ArithmeticException ex){
            System.err.println("Error: " + ex.getMessage());
        }


    }

    private static int divide(int num1, int num2) {
        if (num2 == 0){
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
