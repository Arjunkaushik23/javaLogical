package multithreading;

class MultiThreadDemo2 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception ex) {
            System.out.println("caught excption");
        }
    }

}

public class RunnableExample {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new MultiThreadDemo2());
            thread.start();
        }
    }
}
