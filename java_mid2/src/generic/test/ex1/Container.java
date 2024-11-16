package generic.test.ex1;

public class Container<T> {

    private T data; //데이터는 String이 될 수도 있고, int가 될 수도 있다.

    public void setItem(T data) {
        this.data = data;
    }

    public T getItem() {
        return data;
    }

    public boolean isEmpty() {
        return data == null;
    }
}
