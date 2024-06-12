package practicesession;

public class SplitStringBySpace {
    public static void main(String[] args) {
        String str = "This is the world of the world";
        String[] arr = str.split("\\s");
        for (String s : arr){
            System.out.println(s);
        }
    }
}
