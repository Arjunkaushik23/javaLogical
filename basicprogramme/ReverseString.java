package basicprogramme;

public class ReverseString {
    public static void main(String[] args) {

        // String str = "Arjun is a bad boy";
        // String str2 = "";

        // char ch;
        // // char[] str2 = new char[arr1.length];

        // for (int i = 0; i < str.length(); i++) {
        // ch = str.charAt(i);
        // str2 = ch + str2;

        // }
        // System.out.println(str2);

        String str = "This is the reverse example";
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }

        for (char c : charArray) {
            System.out.print(c);
            // System.out.print();
        }

        String str3 = "Reverse";
        char[] arr = str3.toCharArray();
        String rev = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            rev = rev + str3.charAt(i);
        }
        System.out.println();
        System.out.println(rev);
        int index = 3;

        char characters = str3.chars().mapToObj(ch -> (char) ch).toArray(Character[]::new)[index];
        System.out.println(characters);

        String abcd = "Arjun";
        int index2 = 3;

        char ch = abcd.charAt(index2);
        System.out.println(ch);
    }

}
