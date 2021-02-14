package library;

import javax.xml.namespace.QName;

public class Novel extends Book {
    private String genere;

    public Novel(int catalogId, String category, String DDCId, String name, int numberOfPages, String author, String genere){
        super(catalogId, category, DDCId, name, numberOfPages, author);
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
