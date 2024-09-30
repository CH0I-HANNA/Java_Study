package extends1.ex;

public class Item {
    public String name;
    public int price;

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }

    public int getPrice() {
        return price;
    }
}
