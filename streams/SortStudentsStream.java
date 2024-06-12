package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudentsStream {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        List<Student> collectedStudents = students
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        collectedStudents.forEach(System.out::println);        
    }

}
