package multithreadingexample;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        Runnable depositTask = () -> {
            for (int i = 0; i < 10; i++) {
                bankAccount.deposit(100);
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 10; i++) {
                bankAccount.withdraw(50);
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(depositTask, "User1");
        Thread t2 = new Thread(withdrawTask, "User2");
        Thread t3 = new Thread(depositTask, "User3");
        Thread t4 = new Thread(withdrawTask, "User4");


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(STR."Final balance : \{bankAccount.getBalance()}");

    }
}
