package practicesession;

abstract class Product{
    public abstract void display();
}

class ConcreteProductA extends Product{
    @Override
    public void display(){
        System.out.println("This is a Concrete Product A");
    }
}

class ConcreteProductB extends Product{
    @Override
    public void display(){
        System.out.println("This is a Concrete Product B");
    }
}

abstract class Creator{
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator{
    @Override
    public Product factoryMethod(){
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator{
    @Override
    public Product factoryMethod(){
        return new ConcreteProductB();
    }

}

public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.display();

        Creator creatorB = new ConcreteCreatorA();
        Product productB = creatorB.factoryMethod();
        productB.display();

    }

}
