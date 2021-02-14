package library;

public class Book extends Catalog{
    private String name;
    private String author;
    private int numberOfPages;



    public Book(int catalogId, String category, String DDCId, String name, int numberOfPages, String author) {
        super(catalogId, category, DDCId );
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return  "Name " + getName() +  " author " + getAuthor()  + " number of pages "  + getNumberOfPages();
    }
}
