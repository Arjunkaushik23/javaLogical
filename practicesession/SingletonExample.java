package practicesession;

import string.Singleton;

public class SingletonExample {

    private static SingletonExample singleton;

    private SingletonExample (){};

    private static SingletonExample getInstance() {
        if (singleton == null){
            singleton = new SingletonExample();
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello, I am Singleton");
    }

    public static void main(String[] args) {
        SingletonExample singleton = new SingletonExample();
        singleton.showMessage();
    }
}
