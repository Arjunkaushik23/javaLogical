package string;

import java.util.Iterator;

public class CopyOnWriteArrayList {

    public static void main(String[] args) {
        java.util.concurrent.CopyOnWriteArrayList<String> list = new java.util.concurrent.CopyOnWriteArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("BlackBerry");

        Thread thread = new Thread(() ->{
            System.out.println("Thread starting to modify the list...");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            list.add("Grapes");
            System.out.println("Thread finished modifying the list...");
        });
        thread.start();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {

            String fruit = iterator.next();
            System.out.println("Element: " + fruit);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("List after iteration : " + list);
    }
}
