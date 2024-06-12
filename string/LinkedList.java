package string;

public class LinkedList {

    public static void main(String[] args) {
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        System.out.println(linkedList.toString());

        linkedList.remove(2);

        System.out.println(linkedList);

        linkedList.forEach(System.out::print);
    }



}
