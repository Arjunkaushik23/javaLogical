package practicesession;

// Product Interface
interface Productivity {
    void display();
}

// Concrete Products
class ConcreteProductivityA implements Productivity {
    @Override
    public void display() {
        System.out.println("This is Concrete Product A.");
    }
}

class ConcreteProductivityB implements Productivity {
    @Override
    public void display() {
        System.out.println("This is Concrete Product B.");
    }
}

// Factory Interface
interface Factory {
    Productivity factoryMethod();
}

// Concrete Factories
class ConcreteFactoryA implements Factory {
    @Override
    public Productivity factoryMethod() {
        return new ConcreteProductivityA();
    }
}

class ConcreteFactoryB implements Factory {
    @Override
    public Productivity factoryMethod() {
        return new ConcreteProductivityB();
    }
}

// Client Code
public class FactoryMethodExample {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Productivity productA = factoryA.factoryMethod();
        productA.display();

        Factory factoryB = new ConcreteFactoryB();
        Productivity productB = factoryB.factoryMethod();
        productB.display();
    }
}

