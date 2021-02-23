package library;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    private String name;
    private ArrayList<Book> catalog;


    public Catalog (String name){
        this.name = name;
        this.catalog = new ArrayList<>();
    }



    public void addBook(){
        System.out.println("Please enter type of book novel / artalbum");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        if ( type.toLowerCase().equals("novel")){
            System.out.println("Name of book");
            String name = sc.nextLine();
            System.out.println("Author");
            String author = sc.nextLine();
            System.out.println("Number of pages ");
            int numberOfPages = Integer.valueOf(sc.nextLine());
            Book novel = new Novel(name, numberOfPages, author);
            catalog.add(novel);
        }else if (type.toLowerCase().equals("artalbum")){
            System.out.println("Name of art album");
            String name = sc.nextLine();
            System.out.println("Paper quality");
            String paperQaulity = sc.nextLine();
            System.out.println("Number of pages");
            int numberOfPages = Integer.valueOf(sc.nextLine());
            Book artAlbum = new ArtAlbum(name, numberOfPages, paperQaulity);
            catalog.add(artAlbum);

        }
    }


    public void listBooks(){
        if (this.catalog.size() == 0){
            System.out.println("No books");
        }else{
            for (Book book : catalog){
                System.out.println(book);
            }
        }

    }


    public void searchByAuthor(){}

    public void searchByTitle(){}

    public void searchByPaperQuality(){}

    public void update(Book book){}


    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        String toPrint = "";

        if (this.catalog == null){
            return  "No books";
        }
        for (Book book : catalog){
            toPrint += book.toString() + "\n" ;
        }

        return toPrint;
    }
}
