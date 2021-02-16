package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Catalog> libary = new HashMap<>();
        ArrayList<Catalog> catalog = new ArrayList<>();
        boolean isSrunning = true;

        while (isSrunning) {
//            System.out.println("Enter catalog ID");
            Scanner sc = new Scanner(System.in);
           String catalogID = sc.nextLine();
            if (libary.containsKey(catalogID)) {
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
                    libary.get(catalogID).addBook(new ArtAlbum(author, title, numberOfPages, paperQuality), numberOfCopies);

                } else {
                    System.out.println("Please enter a valid type Novel / ArtAlbum ");
                    type = sc.nextLine();
                }
            }else {
                Catalog scifi = new Catalog(catalogID);
                System.out.println("Catalog will be created ");
                libary.put(catalogID, new Catalog(catalogID));
                System.out.println("Do you want to add books to this catalog ?");
                String answer = sc.nextLine();
                if (answer.equals("yes") || answer.equals("y")){
                    // add method for inserting books
                }else {
                    System.out.println("Done adding to the catalog ");
                }

            }
        }
    }

}