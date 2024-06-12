package string;

public class GenericClass<T> {
    private  T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerObj = new GenericClass<>(10);
        GenericClass<String> stringObj = new GenericClass<>("Arjun");

        System.out.println("Integer value : " + integerObj.getValue());
        System.out.println("String value : " + stringObj.getValue());
    }
}

