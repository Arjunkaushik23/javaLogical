package basicprogramme;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListConversion {
    public static void main(String[] args) {
        List<String> aL = Arrays.asList("Geeks", 
        "forGeeks", 
        "A computer Portal");

        System.out.println(aL);

        List<String> lL = converToAll(aL);

        System.out.println("LinkedList : " + lL);

       }

    private static <T> List<T> converToAll(List<T> aL) {
        // TODO Auto-generated method stub
       return aL.stream().collect(Collectors.toCollection(LinkedList::new));
    }
    
}
