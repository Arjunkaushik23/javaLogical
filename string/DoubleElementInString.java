package string;

public class DoubleElementInString {

    public static void main(String[] args) {

        String str1 = "arjun";
        String str2 = "arjunkaushik";

        // char[] ch1 = str1.toCharArray();
        // char[] ch2 = str2.toCharArray();

        

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {

            int flag = 0;
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {
                    flag = 1;
                }

                if (flag != 1) {
                    stringBuilder.append(str1.charAt(i));
                }

            }

        }

        System.out.println(stringBuilder);
    }

}
