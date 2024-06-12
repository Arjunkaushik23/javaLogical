package design;

import practicesession.SingletonExample;
import string.Singleton;


// Singleton Example :

public class SingletonExamples {
    private static SingletonExamples instance;

    private SingletonExamples(){}

    public static SingletonExamples getInstance(){
        if (instance == null){
            instance = new SingletonExamples();
        }
        return  instance;
    }

    public void showMessage(){
        System.out.println("Hello Singleton !!");
    }

}

 class Main{
     public static void main(String[] args) {
         SingletonExamples singletonExamples = SingletonExamples.getInstance();
         singletonExamples.showMessage();
         SingletonExamples singletonExamples1 = SingletonExamples.getInstance();
         singletonExamples1.showMessage();
     }
}
