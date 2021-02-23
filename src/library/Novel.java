package library;

public class Novel extends Book{

    private String author;

    public Novel(String name, int numberOfPages, String author){
        super(name, numberOfPages);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        return "Name " +  getName() + " - "+ " author "+  getAuthor() + " - " + getNumberOfPages() + " pages ";
    }

}
