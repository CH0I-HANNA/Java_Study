package generic.ex1;

public class GenericBox<T> {

    private T value; //타입이 T인 value

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
