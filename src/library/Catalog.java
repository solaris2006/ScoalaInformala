package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    private String catalogId;
    private  int numberOfCopies;



    private static int totalBooks ;
    private static ArrayList<Book> books = new ArrayList<>();


    public Catalog(String catalogId){
        this.catalogId = catalogId;


    }

    public void addBook(Book book){
        this.totalBooks += numberOfCopies;
        books.add(book);
    }

    public  String catalogID(){
        System.out.println("Enter catalog ID");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /* list all books in the catalog */
    public void list(){
        for (Book book : books){
            System.out.println(book);
        }


    }


    /* search by author / title */
    public void search(){
        System.out.println("Search by author / title");
        Scanner sc = new Scanner(System.in);
        String searchString  = sc.nextLine();
        ArrayList<Book> books;

        while (true){
            if (searchString.toLowerCase().equals("author")){
                System.out.println("Please enter the author name");
                String author = sc.nextLine();
                books = searchByAuthor(author);
                break;
            }else if (searchString.toLowerCase().equals("title")){
                System.out.println("Please enter the title");
                String title = sc.nextLine();
                books = searchByTitle(title);
                break;
            }{
                System.out.println("Please enter serach criteria (author / title)");
                searchString = sc.nextLine();

            }
        }
        if (books == null){
            System.out.println("No books found");
        }else {
            for (Book book : books){
                System.out.println(book);
            }
        }
    }

    private ArrayList<Book> searchByAuthor(String author){
        ArrayList<Book> searchResults = new ArrayList<>();

        for (Book book : books) {
            if (author.toLowerCase().equals(book.getAuthor().toLowerCase())) {
                searchResults.add(book);
            }
        }
        if (searchResults.isEmpty()){
            return null;
        }else{
           return searchResults;
        }


    }

    private ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> searchResults = new ArrayList<>();

        for (Book book : books) {
            if (title.toLowerCase().equals(book.getTitle().toLowerCase())) {
                searchResults.add(book);
            }
        }
        if (searchResults.isEmpty()){
            return null;
        }else{
            return searchResults;
        }
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }


    public static int getTotalBooks() {
        return totalBooks;
    }





//    @Override
//    public String toString(){
//
//        return "Catalog ID " + getCatalogId()  + "\n" + " type " + getType() + " number of books " + "\n"
//                + getNumberOfCopies() + "\n" + "----------";
//
//    }

}
