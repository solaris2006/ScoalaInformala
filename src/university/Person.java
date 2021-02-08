package university;

public class Person {
    String gender;
    String firstName;
    String lastName;
    String email;
    String telephoneNumber;
    int age;

    public String sayHello() {
        return ("Hello " + firstName + " , " + lastName);
    }
}
