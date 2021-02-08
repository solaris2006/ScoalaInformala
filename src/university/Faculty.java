package university;

public class Faculty extends University {
    private String deanID;
    private String proffessorID;
    private String proffessorType;
    private Professor professor;

    Amphitheatre[] amphitheatres;
    Laboratory[] laboratories;
    Course[] courses;
    Professor[] professors;

    public String getDeanID() {
        return deanID;
    }

    public void setDeanID(String deanID) {
        this.deanID = deanID;
    }

    public String getProffessorID() {
        return proffessorID;
    }

    public void setProffessorID(String proffessorID) {
        this.proffessorID = proffessorID;
    }

    public String getProffessorType() {

        return this.professor.getRank() ;
    }

    public void setProffessorType(String proffessorType) {
        this.proffessorType = proffessorType;
    }
}
