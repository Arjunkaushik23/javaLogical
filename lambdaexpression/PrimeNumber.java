package lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;


        List<Integer> primeNumbers = findPrimes(start, end);
        System.out.println(STR."Prime numbers are : \{primeNumbers}") ;
    }

    private static List<Integer> findPrimes(int start, int end) {

        IntPredicate isPrime = n->n>1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i-> n%i==0);


        return IntStream.rangeClosed(start, end)
                .filter(isPrime).boxed().collect(Collectors.toList());
    }


}
