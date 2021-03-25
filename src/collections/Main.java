package collections;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        //create address
        Address buc = new Address("Bucharest");
        Address tim = new Address("Timisoara");
        Address sib = new Address("Sibiu");
        Address ias = new Address("Iasi");
        Address ard = new Address("Arad");
        Address cj = new Address("Cluj");

        //create students
        Student cristian = new Student("Cristian");
        Student cristina = new Student("Cristina");
        Student alex = new Student("Alex");
        Student sorin = new Student("Sorin");
        Student ileana = new Student("Ileana");
        Student mihai = new Student("Mihai");

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

        Hobby chess  = new Hobby("chess", 10);
        chess.addAddress(buc);
        chess.addAddress(cj);
        chess.addAddress(ias);


        Hobby running = new Hobby("running", 10);
        running.addAddress(buc);
        running.addAddress(cj);
        running.addAddress(ias);
        running.addAddress(ard);
        running.addAddress(sib);


        List<Hobby> cristiansHobbies  = new ArrayList<>();
        List<Hobby> cristinasHobbies  = new ArrayList<>();
        List<Hobby> alexHobbies  = new ArrayList<>();
        List<Hobby> sorinHobbies = new ArrayList<>();
        List<Hobby> ileanaHobbies = new ArrayList<>();
        List<Hobby> mihaiHobbies = new ArrayList<>();


        StudentDb studentDb1 = new StudentDb("students1");


        cristiansHobbies.add(swimming);
        cristiansHobbies.add(tennis);
        studentDb1.addStudents(cristian, cristiansHobbies);

        cristinasHobbies.add(swimming);
        cristinasHobbies.add(cycling);
        studentDb1.addStudents(cristina, cristinasHobbies);


        alexHobbies.add(tennis);
        alexHobbies.add(cycling);
        studentDb1.addStudents(alex, alexHobbies);


        StudentDb studentDb2 = new StudentDb("students1");
        sorinHobbies.add(swimming);
        sorinHobbies.add(running);
        studentDb2.addStudents(sorin, sorinHobbies);

        mihaiHobbies.add(cycling);
        mihaiHobbies.add(chess);
        studentDb2.addStudents(mihai, mihaiHobbies);

        ileanaHobbies.add(tennis);
        ileanaHobbies.add(swimming);
        studentDb2.addStudents(ileana, ileanaHobbies);



//        studentDb1.addStudents(cristina, cristinasHobbies);
//        studentDb1.addStudents(cristian, cristiansHobbies);


        Collection<StudentDb> collection = new ArrayList<>();
        Collection <Student> swimmingHobbies = new ArrayList<>();
        collection.add(studentDb1);
        collection.add(studentDb2);

        for (StudentDb std : collection){
            Collection<Student> tempHobbies =  findCollectionWithHobby(swimming, std.getStudentHobbies());
            for (Object student: tempHobbies){
                swimmingHobbies.add((Student) student);
            }


        }

        System.out.println("Swimming hobbies ");
        for (Student std : swimmingHobbies)
            System.out.println(std.getName());
       }


    private static Collection<Student> findCollectionWithHobby(Hobby hobby, Map<Student, List<Hobby>> studentHobbies){

        Collection<Student> studentsWithSharedHobbies = new ArrayList<>();
        for (Map.Entry<Student, List<Hobby>> entry : studentHobbies.entrySet()){
            if (entry.getValue().contains(hobby)){
                studentsWithSharedHobbies.add(entry.getKey());
            }
        }

        return studentsWithSharedHobbies;
    }
}

