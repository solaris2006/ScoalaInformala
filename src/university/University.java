package university;

public class University {
    private String institutionName;
    private String institutionAddress;
    private boolean isOpen;
    private Professor rector;


    private Student[] students;
    private Employee[] employees;
    private Faculty[] faculties;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionAddress() {
        return institutionAddress;
    }

    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Professor getRector() {
        return rector;
    }

    public void setRector(Professor rector) {
        this.rector = rector;
    }
}
