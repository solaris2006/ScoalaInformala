package library;

public class ArtAlbum extends Book{
    private String paperQuality;


    public ArtAlbum(String author, String title ,int numberOfPages, int numberOfCopies, String paperQuality){
        super(author, title, numberOfPages, numberOfCopies);
        this.paperQuality = paperQuality;

    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}
