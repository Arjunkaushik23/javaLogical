package streams;

public class Demo {

    public static void main(String[] args) {
        
        for(String arguments : args){
            System.out.println(arguments);
        }
    }

    public static void main(int number) {
        System.out.println("Main method with int argument");
        System.out.println("Number: " + number);
    }

    public static void main(String arg) {
        System.out.println("Main method with String argument");
        System.out.println("Argument: " + arg);
    }

}
