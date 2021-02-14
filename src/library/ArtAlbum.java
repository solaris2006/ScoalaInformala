package library;

public class ArtAlbum extends Book{
    private String paperQuality;

    public ArtAlbum(int catalogId, String category,
                    String DDCId, String name, int numberOfPages,
                    String author,
                    String paperQuality){
        super(catalogId, category, DDCId, name, numberOfPages, author);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}
