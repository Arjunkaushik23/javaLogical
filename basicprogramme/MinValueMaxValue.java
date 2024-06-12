package basicprogramme;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;

public class MinValueMaxValue {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(5);
        l.add(18);
        l.add(4);
        l.add(6);

        int minimun = Collections.min(l);
        int maximum = Collections.max(l);

        if (minimun == maximum) {
            System.out.println("All Elements are equal");
        } else {
            System.out.println("Min value of list is : " + minimun);
            System.out.println("Maximum value of list is : " + maximum);
        }

    }

}
