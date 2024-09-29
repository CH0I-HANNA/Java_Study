package extends1.ex;

public class Movie extends Item {
    public String director;
    public String actor;

    public Movie(String name, int price, String director, String actor) {
        super();
        super.name = name;
        super.price = price;
        this.director = director;
        this.actor = actor;
    }

    public void print() {
        super.print();
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }
}
