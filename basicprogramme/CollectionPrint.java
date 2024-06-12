package basicprogramme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPrint {
    public static void main(String[] args) {
        String[] str = { "Rahul", "Utkarsh", "Shubham", "Neelam" };
        List<String> strList = new ArrayList<>();
        Collections.addAll(strList, str);

        System.out.println(strList);
    }
}
