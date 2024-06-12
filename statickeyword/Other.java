package statickeyword;

public class Other {

    static int a = 1000;
    static {
         a = 1024342;
        System.out.println(STR."value of a = \{a}");
    }

    static {
        int b = 11;
        System.out.println(STR."value of b = \{b}");
    }

    public static int main(Character[] args) {
        System.out.println("This is a main method");
        return 1;
    }

    public static void main(String[] args) {
        Other other = new Other();
        Character[] chars = new Character[12];
        main(chars);
        System.out.println(a);

        System.out.println("______________");
        System.out.println(main(chars));
        System.out.println("This is my main method");
    }
}
