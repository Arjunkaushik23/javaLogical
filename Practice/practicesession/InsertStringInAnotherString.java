package practicesession;

public class InsertStringInAnotherString {
    public static void main(String[] args) {
        String str = "GeeksGeek";
        String str2 = "For";

        int index = 4;

        String string = new String();
        for (int i = 0; i < str.length(); i++) {
            string += str.charAt(i);
            if (i == index){
                string += str2;
            }
        }

        System.out.println(string);
    }
}
