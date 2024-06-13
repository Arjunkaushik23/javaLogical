package streams;

public class CameSnakeCase {

    public static void main(String[] args) {
        String str = "ThisIsTheMan";
        String result = changeToSnakeCase(str);
        System.out.println(result);

        
    }

    private static String changeToSnakeCase(String str) {
        if (str == null && str.isEmpty()) {
            return str;
        }

        StringBuilder builder = new StringBuilder();


        for(char c: str.toCharArray()){

            if (Character.isUpperCase(c)) {
                if (builder.length() > 0) {
                    builder.append("_");
                }
                builder.append(Character.toLowerCase(c));
            }else{
                builder.append(c);
            }
        }
        return builder.toString();
    }

}
