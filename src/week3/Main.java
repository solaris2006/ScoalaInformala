package week3;

/**
 *
 */
public class Main {



    public static void main(String[] args) {
        Person[] persons = loadPersons();
        sendMessage(persons);
    }

    public static Person[] loadPersons() {
        Student student = new Student();
        student.firstName = "Andrei";
        student.lastName = "Brisan";

        Electrician electrician = new Electrician();
        electrician.firstName = "Ion";
        electrician.lastName = "Pop";

        Professor professor1 = new Professor();
        professor1.lecturer = true;
        professor1.firstName = "Mihai";
        professor1.lastName = "Cristea";

        Professor professor2 = new Professor();
        professor2.doctor = true;
        professor2.lecturer = true;
        professor2.firstName = "Cristi";
        professor2.lastName = "Pintican";

        return new Person[] {student, electrician, professor1, professor2};
    }

    public static void sendMessage(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.sayHello());
        }
    }
}
