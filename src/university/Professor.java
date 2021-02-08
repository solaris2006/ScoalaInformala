package university;

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

    public String getRank(){
        String rank = "";

        if (doctor) {
            rank = "doctor";
        }else if(lecturer){
            rank = "lecturer";
        }else{
            rank = "professor";
        }

        return rank;

    }

}
