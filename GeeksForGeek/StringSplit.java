package GeeksForGeek;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {

        String str = "red,green,blue,yellow,orange,voilet";

        String[] colours = str.split(",");

        Arrays
        .stream(colours)
        .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
        .forEach(System.out::println);
    }
}
