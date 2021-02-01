package week3;

public class Professor extends Employee{
    boolean doctor;
    boolean lecturer;

    public String sayHello() {
        String title = "prof.";
        if (doctor) {
            title += " dr.";
        }

        if (lecturer) {
            title += " lect.";
        }

        return ("Hello " + title + " " + firstName + " , " + lastName);
    }

}
