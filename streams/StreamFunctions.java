package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFunctions {

    private static List<Product> productsList = new ArrayList<>();

    public static void main(String[] args) {

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        // With Java 8 Stream API'S
        withStreamAPI();

    }

    private static void withStreamAPI() {
        productsList
                .stream()
                .filter(a -> a.getPrice() > 25000)
                .map(a -> a.getPrice())
                .toList()
                .forEach(System.out::println);

        productsList.stream()
                .filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getPrice()));

        Double sum = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.getPrice()));

        System.out.println(sum);

        Product productA = productsList.stream()
                .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

        System.out.println(productA.getPrice());

        Product productB = productsList.stream()
                .max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();

        System.out.println(productB.getPrice());

        Set<Float> set = productsList.stream()
                .filter(product -> product.getPrice() < 30000)
                .map(product -> product.getPrice())
                .collect(Collectors.toSet());

        System.out.println(set);

        Map<Integer, Float> map = productsList.stream()
                .collect(Collectors.toMap(p -> p.getId(), p -> p.getPrice()));

        System.out.println(map);

        List<Float> list1 = productsList.stream()
                .filter(p -> p.getPrice() > 30000)
                .map(Product::getPrice)
                .toList();

        System.out.println(list1);

        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        List<String> collect = fruits
                .stream()
                .sorted(Comparator.naturalOrder()) // or to Comparator.reverseOrder() for descending order sorting
                .collect(Collectors.toList());

        // OR

        List<String> collect2 = fruits.stream()
                .sorted((o1, o2) -> o2.compareTo(o1)).toList(); // change o2.compareTo(o1) for descending order sorting

        // OR

        List<String> collect3 = fruits.stream().sorted().toList();

        System.out.println(collect);
        System.out.println(collect2);
        System.out.println(collect3);
        
        

    }

}
