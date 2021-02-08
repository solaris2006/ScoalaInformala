package library;

public class Catalog {
    private int catalogId;
    private String category;
    private String DDCId;

    public Catalog(){};

    public Catalog(int catalogId, String category, String DDCId) {
        this.catalogId = catalogId;
        this.category = category;
        this.DDCId = DDCId;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDDCId() {
        return DDCId;
    }

    public void setDDCId(String DDCId) {
        this.DDCId = DDCId;
    }
}
