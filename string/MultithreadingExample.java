package string;

public class MultithreadingExample {
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + i);
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("Main : " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
