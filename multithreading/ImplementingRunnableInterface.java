package multithreading;

class RunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }
}

public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        int n =8;
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(new RunnableDemo());
            t.start();
        }
    }
}
