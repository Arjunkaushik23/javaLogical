import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        String[] arr = {"abc", "abcd", "abcde","cef","ccd","pef"};
      List<String> arrayList = Arrays.asList(arr);
      
      List<String> newList = arrayList.stream().filter(a -> a.startsWith("a")).toList();
         
      newList.forEach(System.out::println);
    }

}
