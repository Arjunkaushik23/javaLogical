package multithreading;

class MyRunnable implements Runnable{
    private String threadNew;
    public MyRunnable(String threadNew){
        this.threadNew = threadNew;
    }

    @Override
    public void run(){
        System.out.println("Thread " + threadNew + " is running");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Thread " + threadNew + " Not working.....Intrupted");
        }

        System.out.println("Thread " + threadNew + " complete ...");
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));

        t1.start();
        t2.start();


        }

}
