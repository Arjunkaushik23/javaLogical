package basicprogramme;

public class StringFunction {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String concat = s1.concat(s2);
        String combine = s1 + " " + s2;

        System.out.println(concat);
        System.out.println(combine);

        boolean isEqual = s1.equals(s2);
        int compareToResult = s1.compareTo(s2);

        System.out.println(isEqual);
        System.out.println(compareToResult);

        String s3 = "0123456789";
        String sub = s3.substring(3, 8);
        System.out.println(sub);

        String replace = s3.replace('5', '9');
        System.out.println(replace);

        String s4 = "hello";
        String toUpperCase = s4.toUpperCase();
        System.out.println(toUpperCase);

        System.out.println(toUpperCase.toLowerCase());

        int index = s4.indexOf('l');
        System.out.println(index);
        System.out.println(s4.lastIndexOf('l'));
        String[] strs = s4.split("e");
        for (String string : strs) {
            System.out.print(string + " -> ");
            System.out.println();
        }

        String s5 = " Hello This is arjun   ";
        String trimmed = s5.trim();

        System.out.println(trimmed);

        String formatted = String.format("Name: %s, Age: %d", "John", 30);
        System.out.println(formatted);

        Integer num1 = 5;
        Integer num2 = 5;

        String str1 = "hello";
        String str2 = "hello";

        System.out.println(num1.equals(num2));
        System.out.println(str1.equals(str2));

        int a = 20;
        int b = 30;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }

}
