package Interfaces;

public interface Animal {

    default void bark() {
        System.out.println("dog bark");
    }

    static void sleep() {
        System.out.println("Animal is sleeping");
    }

    public String name();

}
