package multithreading;


class MultithreadingExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + "is running");
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {

        int n = 8;

        for (int i = 0; i <n; i++) {
            MultithreadingExample example = new MultithreadingExample();
            example.start();
        }

    }
}
