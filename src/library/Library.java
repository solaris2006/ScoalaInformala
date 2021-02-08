package library;

public class Library {
    private boolean isOpen;
    private int badgeId;
    private String librarianName;
    private String address;
   private Catalog[] catalogs;



    public Library() { };

    public Library(boolean isOpen, int badgeId, String librarianName, String address) {
        this.isOpen = isOpen;
        this.badgeId = badgeId;
        this.librarianName = librarianName;
        this.address = address;
    }

    public Library(Catalog[] catalogs){
        this();
        this.catalogs = catalogs;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Catalog[] getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Catalog[] catalogs) {
        this.catalogs = catalogs;
    }
}
