package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student cristian = new Student();
        Student alex = new Student();
        Student simona = new Student();

        Address bucharest = new Address("bucharest");
        Address timisoara = new Address("timisoara");
        Address iasi = new Address("iasi");
        Address cluj = new Address("cluj");
        Address sibiu = new Address("sibiu");
        List<Address> addresses1  = new ArrayList<>() ;
        addresses1.add(bucharest);
        addresses1.add(timisoara);
        addresses1.add(iasi);
        List<Address> addresses2  = new ArrayList<>() ;
        addresses2.add(iasi);
        addresses2.add(sibiu);
        addresses2.add(cluj);




        Hobby cycling = new Hobby("cycling", 3, addresses1);
        Hobby hiking = new Hobby("hiking", 2, addresses2 );
        Hobby readingBooks = new Hobby("reading books", 10, addresses1);
        Hobby playChess = new Hobby("play chess", 5, addresses2);

        List<Hobby> sportHobbies = new ArrayList<>();
        sportHobbies.add(hiking);
        sportHobbies.add(cycling);

        List<Hobby> softHobbies = new ArrayList<>();
        softHobbies.add(readingBooks);
        softHobbies.add(playChess);

        HashMap listOfHobbies =  new HashMap<>();
        listOfHobbies.put(cristian, sportHobbies);
        listOfHobbies.put(alex, softHobbies);




    }
}
