package library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private int choice ;
    private Catalog catalog;

    public Menu(Scanner scanner){
        this.scanner = scanner;
    }

    public void start(){
        boolean isRunning = true;
        createCatalog();
        while (isRunning){

            setChoice();
            isRunning = continueRunning();

        }


    }

    public void  createCatalog(){
        System.out.println("name of catalog ");
        String name = scanner.nextLine();
        this.catalog = new Catalog(name);
        System.out.println("catalog " +  catalog.getName() + " was created");
    }

    public void setChoice(){
            boolean valid;

            do {
                valid  = true;
                System.out.println("Please choose an operation");
                System.out.println("1 - Add book");
                System.out.println("2 - List books");
                try{
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice < 1 || choice > 2){
                        throw new IllegalArgumentException();
                    }
                    switch (choice){
                        case 1:
                            this.catalog.addBook();
                            break;
                        case 2:
                            this.catalog.listBooks();
                            break;
                        default:
                            System.out.println("Please enter a valid choice");
                            break;

                    }
                }catch (IllegalArgumentException e){
                    System.out.println("This is an invalid entry. Please try again.");
                    valid = false;
                }
            }while (!valid);




    }

    public boolean continueRunning(){
        boolean isRunning = true;
        System.out.println("Continue ? y / n" );
        String answer = scanner.nextLine();
        if (answer.toLowerCase().equals("y")){
            isRunning = true;
        }else if (answer.toLowerCase().equals("n")){
            System.out.println("Program will exit now...");
            isRunning = false;
        }else{
            System.out.println("Unknown operation");
        }

        return isRunning;

    }


}
