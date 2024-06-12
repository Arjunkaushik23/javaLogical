package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students{
    int rollno;
    String name;
    String address;

    public Students(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return STR."\{this.rollno} \{this.name} \{this.address}";
    }
}

class SortByRoll implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return -o1.rollno+o2.rollno;
    }
}

class SortByName implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class TestSort2 {

    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students(111, "Mayank", "London"));
        students.add(new Students(131, "Anshul", "NYC"));
        students.add(new Students(121, "Solanki", "Jaipur"));
        students.add(new Students(101, "Aggarwal", "Hong Kong"));

        System.out.println("Unsorted:");
        for (Students student : students) {
            System.out.println(student);
        }

        students.sort(new SortByRoll());

        System.out.println("\nSorted by roll number:");
        for (Students student : students) {
            System.out.println(student);
        }

        students.sort(new SortByName());

        System.out.println("\nSorted by name:");
        for (Students student : students) {
            System.out.println(student);
        }
    }
}
