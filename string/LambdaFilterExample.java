package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(12);
        numbers.add(20);
        numbers.add(14);
        numbers.add(40);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num% 5== 0)
//                .collect(Collectors.toList());
        .toList();

        System.out.println("Filtered numbers" + filteredNumbers);

        System.out.println("_________________________________________________");

        numbers.forEach(num -> System.out.println(num * 3));

        System.out.println("_________________________________________________");

        Thread thread = new Thread(() ->{
            for (int i = 0; i < 5; i++) {

                try {
                    System.out.println("Thread : " + i);
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
