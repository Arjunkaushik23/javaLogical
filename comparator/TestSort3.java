package comparator;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        if (age == o.age){
            return 0;
        }else if (age < o.age){
            return -1;
        }
        else{
            return 1;
        }
    }
}

public class TestSort3 {
    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);

        for (Student st : al){
            System.out.println(STR."\{st.rollNo} \{st.name} \{st.age}");
        }
    }
}
