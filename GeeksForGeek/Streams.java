package GeeksForGeek;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class Streams {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 32),
            new Person("mohan", 25),
            new Person("aibhav", 21)
        );

        people.stream().sorted(Comparator.comparingInt(Person::getAge))
        // people.stream().sorted(Comparator.comparing(p -> p.name))
        .forEach(p -> System.out.println(p.name + " : " + p.age));
        
        
    }
}
