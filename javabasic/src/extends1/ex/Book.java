package extends1.ex;

public class Book extends Item {
    public String author;
    public String isbn;

    public Book(String name, int price, String author, String isbn) {
        super();
        super.name = name;
        super.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
        super.print();
        System.out.println("- 저자: " + author + ", isbn: " + isbn);
    }
}
