package library;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(1258444, "Novel", "234DE", "Gone with thw wind", 234,
                "Jack London");
        Book b2 = new Book(1258444, "Novel", "234DE", "Gone with thw wind", 234,
                "Lea Theoni");
        System.out.println(b1.equals(b2));
    }
}
