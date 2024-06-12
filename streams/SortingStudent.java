package streams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudent {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Arjun"));
        students.add(new Student(1, "Zayant"));
        students.add(new Student(1, "Sonu"));
        students.add(new Student(1, "Shivam"));

        
        Collections.sort(students,new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }    
        });


        Collections.sort(students,new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getRollNumber(), o2.getRollNumber());
            }    
        });

        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getRollNumber));

        

    }
}
