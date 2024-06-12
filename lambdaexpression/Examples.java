package lambdaexpression;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class Examples {


    public static void main(String[] args) {

        // lambda simple expression
        Runnable runnable = () -> System.out.println("hello lambda");
        runnable.run();

        // lambda expression with single parameters
        Function<Integer, Integer> square = a -> a*a;
        System.out.println(square.apply(5));

        // lambda expression with multiple parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a+b;
        System.out.println(add.apply(5,5));

        // lambda expression with predicate
        Predicate<Integer> isEven = n -> n%2 == 0;
        System.out.println(STR."Is 10 Even : \{isEven.test(10)}");

        // lambda expression with Consumer
        List<String> l = Arrays.asList("Alice", "Bob", "Charlie");
        l.forEach(System.out::println);

        // lambda expression with supplier
        Supplier<LocalDate> currentDate = LocalDate::now;
        System.out.println(currentDate.get());

        // lambda expression with comparator
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");
        fruits.sort(String::compareTo);
        System.out.println(STR."Sorted list : \{fruits}");

        // lambda expression with stream API
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // lambda with Optional
        Optional<String> optionalName = Optional.of("Arjun");
        optionalName.ifPresentOrElse(
                name -> System.out.println(STR."Hello \{name}"),
                () -> System.out.println("Name not Provided")
        );

        // Lambda with Exception Handling
        Function<String, Integer> parseInt = str -> {
            try {
                int back = Integer.parseInt(str);
                return back;
            }catch(NumberFormatException e){
                throw new IllegalArgumentException(STR."invalid Number: \{str}");
            }
        };
        System.out.println(STR."Parsed Number : \{parseInt.apply("123")}");


    }
}
