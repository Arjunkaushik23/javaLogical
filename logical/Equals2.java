public class Equals2 {
    public static void main(String[] args) {
        String str = "Arjun";
        String str2 = "Arjun";
        String str3 = new String("Arjun");

        // System.out.println(str == str2);
        // System.out.println(str.equals(str2));
        System.out.println(str==str3);
        System.out.println(str.equals(str3));
    }
}
