package queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> de_que = new ArrayDeque<>();
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        de_que.addFirst(564);
        de_que.addFirst(432);
        de_que.addLast(564);
        de_que.addLast(345);
        de_que.addLast(12);

        System.out.println(de_que);

    }
}
