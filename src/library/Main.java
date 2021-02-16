package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Catalog> libary = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean isSrunning = true;
        while (isSrunning) {
            String catalogID = addCatalogID();
            if (libary.containsKey(catalogID) ) {
                  Book book =  addBooks();
                  if (book == null){
                      System.out.println("Please enter a valid type Novel / ArtAlbum ");
                      book = addBooks();
                  }else {

                      libary.get(catalogID).addBook(book);
                  }


            } else {
                System.out.println("Catalog will be created ");
                libary.put(catalogID, new Catalog(catalogID));
                System.out.println("Do you want to add books to this catalog ?");
                String answer = sc.nextLine();
                if (answer.equals("yes") || answer.equals("y")){
                    Book book =  addBooks();;
                    if (book == null){
                        System.out.println("Please enter a valid type Novel / ArtAlbum ");
                        book = addBooks();
                    }else {
                        libary.get(catalogID).addBook(book);

                    }
                }else {
                    System.out.println("Done adding to the catalog ");
                }

            }
        }

    }
    public static String addCatalogID(){
        System.out.println("Enter catalog ID");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static Book addBooks(){

        System.out.println("Enter book type Novel / ArtAlbum");
        Scanner  sc = new Scanner(System.in);
        String type = sc.nextLine();
        if (type.toLowerCase().equals("novel")) {
            System.out.println("Enter author");
            String author = sc.nextLine();
            System.out.println("Enter title");
            String title = sc.nextLine();
            System.out.println("Enter type");
            String novelType = sc.nextLine();
            System.out.println("Enter number of pages");
            int numberOfPages = Integer.parseInt(sc.nextLine());
            System.out.println("Number of copies");
            int numberOfCopies = sc.nextInt();
            return new Novel(author, title,  numberOfPages, numberOfCopies, novelType);
        }
        else if (type.toLowerCase().equals("artalbum")) {
            System.out.println("Enter author");
            String author = sc.nextLine();
            System.out.println("Enter title");
            String title = sc.nextLine();
            System.out.println("Enter number of pages");
            int numberOfPages = Integer.parseInt(sc.nextLine());
            System.out.println("Enter paper quality");
            String paperQuality = sc.nextLine();
            System.out.println("Number of copies");
            int numberOfCopies = sc.nextInt();
            return new ArtAlbum(author, title, numberOfPages, numberOfCopies, paperQuality);

        } else {
            return null;

        }
    }

}