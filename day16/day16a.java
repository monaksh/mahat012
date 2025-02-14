class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class IntegerBox extends Box<Integer> {
}

class StringBox extends Box<String> {
}

public class day16a {
    public static void main(String[] args) {
        IntegerBox intBox = new IntegerBox();
        intBox.setValue(42);
        System.out.println("IntegerBox value: " + intBox.getValue());

        StringBox stringBox = new StringBox();
        stringBox.setValue("Hello, World!");
        System.out.println("StringBox value: " + stringBox.getValue());
    }
}
