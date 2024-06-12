package practicesession;

public class EvenLengthString {

    public static void main(String[] args) {
        String str = "I am Arjun kaushika";
        String[] split = str.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : split){
            if (s.length() % 2 == 0){
                stringBuilder.append(s);
                stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder);
    }
}
