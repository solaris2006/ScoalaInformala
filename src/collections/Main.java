package collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {

        //create address
        Address buc = new Address("bucharest");
        Address tim = new Address("timisroara");
        Address sib = new Address("sib");

        //create students
        Student cristian = new Student("Cristian");
        Student cristina = new Student("Cristina");
        Student alex = new Student("Alex");

        //create hobbies
        Hobby swimming = new Hobby("swimming", 4);
        swimming.addAddress(buc);
        swimming.addAddress(sib);

        Hobby cycling =  new Hobby("cycling", 2);
        cycling.addAddress(buc);
        cycling.addAddress(tim);

        Hobby tennis = new Hobby("tennins", 6);
        tennis.addAddress(buc);
        tennis.addAddress(sib);

        List<Hobby> cristiansHobbies  = new ArrayList<>();
        List<Hobby> cristinasHobbies  = new ArrayList<>();
        List<Hobby> alexHobbies  = new ArrayList<>();


        Map<Student, List<Hobby>> studentHobbies = new  HashMap<>();

        cristiansHobbies.add(swimming);
        cristiansHobbies.add(tennis);

        studentHobbies.put(cristian, cristiansHobbies);

        cristinasHobbies.add(swimming);
        cristinasHobbies.add(cycling);

        studentHobbies.put(cristina, cristinasHobbies);

        alexHobbies.add(tennis);
        alexHobbies.add(cycling);

        studentHobbies.put(alex, alexHobbies);

       for (Map.Entry<Student, List<Hobby>> entry : studentHobbies.entrySet()){
           System.out.println(entry.getKey().getName());
           List<Hobby> hobbies = entry.getValue();
           for (Hobby hobby : hobbies){
               System.out.println(hobby.getHobby());
           }


       }

       
    }



}
