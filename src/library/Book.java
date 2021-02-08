package library;

public class Book extends Catalog{
    private String name;
    private int numberOfPages;



    public Book(int catalogId, String category, String DDCId, String name, int numberOfPages) {
        super(catalogId, category, DDCId );
        this.name = name;
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
}
