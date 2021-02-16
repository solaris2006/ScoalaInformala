package library;

public class ArtAlbum extends Book{
    private String paperQuality;


    public ArtAlbum(String author, String title ,int numberOfPages, String paperQuality){
        super(author, title, numberOfPages);
        this.paperQuality = paperQuality;

    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}
