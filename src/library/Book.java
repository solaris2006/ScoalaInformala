package library;

public class Book {
    private String author;
    private String title;
    private int numberOfPages;

    public Book(String author, String title, int numberOfPages){
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void setNumberOfBooks(int numberOfBooks) {
        Book.numberOfBooks = numberOfBooks;
    }

    private int quantity;
    private static int numberOfBooks;




    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public String toString(){
        return "author: " + getAuthor() + "\n" +  "title: " + getTitle() + "\n" + "number of pages: " +
                getNumberOfPages() + "\n" + "-----------";
    }


}
