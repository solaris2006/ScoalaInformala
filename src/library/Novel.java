package library;

import javax.xml.namespace.QName;

public class Novel extends Book {
    private String type;

    public Novel( String author, String title , int numberOfPages, int numberOfCopies, String type){
        super(author, title,  numberOfPages, numberOfCopies );
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
