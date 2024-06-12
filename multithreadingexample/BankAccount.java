package multithreadingexample;

public class BankAccount {

    public double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public synchronized void deposit(double amount){
        balance += amount;
        System.out.println(STR."\{Thread.currentThread().getName()} deposited \{amount}, new balance \{balance}");
    }

    public synchronized void withdraw(double amount){
        if(balance > amount) {
            balance -= amount;
            System.out.println(STR."\{Thread.currentThread().getName()} withdraw \{amount} ,new balance \{balance}");
        }
        else {
            System.out.println(STR."\{Thread.currentThread().getName()} tried to withdraw \{amount} but insufficient funds");
        }
    }

    double getBalance(){
        return balance;
    }
}
