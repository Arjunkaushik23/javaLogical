package Interfaces;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Main main = new Main();
        // main.bark();
        // Animal.sleep();
        // String name = main.name();
        // System.out.println(name);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                int sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x * x)
                .sum();

                System.out.println(sum);
    }

    // @Override
    // public String name() {
    //     return "Luffy";
    // }

}
