package collections;

import javax.management.ObjectName;
import java.util.*;

public class StudentDb {
    private String name ;
    private Map<Student, List<Hobby>> studentHobbies = new HashMap<>();

    public StudentDb(String name){
        this.name = name;
    }

    public void addStudents(Student student, List<Hobby> hobbies ){
        if (studentHobbies.containsKey(student)){
            System.out.println("Student already added");
        }else {
            studentHobbies.put(student, hobbies);
        }
    }

    public String getName() {
        return name;
    }

    public Map<Student, List<Hobby>> getStudentHobbies() {
        return studentHobbies;
    }

    public void listHobbies(Student student){
        for (Map.Entry<Student, List<Hobby>> entry : studentHobbies.entrySet()){
            if (entry.getKey().equals(student)){
                System.out.println("Hobbies for " + entry.getKey().getName());
                List<Hobby> hobbies = entry.getValue();
                for (Hobby hobby : hobbies){
                    System.out.println(hobby.getHobby() + " can be practiced in: ");
                    hobby.getAddresses();
                    System.out.println();
                }
            }

        }
    }



}
