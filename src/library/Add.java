package library;

import java.util.HashMap;
import java.util.Scanner;

public  class Add {

    private HashMap<String, Catalog> libary = new HashMap<>();
    private String catalogID;


    public  String catalogID(){
        System.out.println("Enter catalog ID");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public  void addBooks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book type Novel / ArtAlbum");
        String type = sc.nextLine();
        if (type.toLowerCase().equals("novel")) {
            System.out.println("Enter author");
            String author = sc.nextLine();
            System.out.println("Enter title");
            String title = sc.nextLine();
            System.out.println("Enter type");
            String novelType = sc.nextLine();
            System.out.println("Enter number of pages");
            int numberOfPages = sc.nextInt();
            System.out.println("Number of copies");
            int numberOfCopies = sc.nextInt();
            libary.get(catalogID).addBook(new Novel(author, title, numberOfPages, novelType), numberOfCopies);
        } else if (type.toLowerCase().equals("artalbum")) {
            System.out.println("Enter author");
            String author = sc.nextLine();
            System.out.println("Enter title");
            String title = sc.nextLine();
            System.out.println("Enter number of pages");
            int numberOfPages = sc.nextInt();
            System.out.println("Enter paper quality");
            String paperQuality = sc.nextLine();
            System.out.println("Number of copies");
            int numberOfCopies = sc.nextInt();
            this.libary.get(catalogID).addBook(new ArtAlbum(author, title, numberOfPages, paperQuality), numberOfCopies);


        }
}
