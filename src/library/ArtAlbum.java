package library;

public class ArtAlbum extends Book{
    private String paperQuality;

    public ArtAlbum(String name , int numberOfPages, String paperQuality){
        super(name, numberOfPages);
        this.paperQuality = paperQuality;

    }

    public String getPaperQuality() {
        return paperQuality;
    }

    @Override
    public String toString(){
        return "Name " + getName() +  " - " + " paper quality " + getPaperQuality() + " - " + getNumberOfPages() + " pages";
    }
}
