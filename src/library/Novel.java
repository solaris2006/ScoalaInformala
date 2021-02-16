package library;

import javax.xml.namespace.QName;

public class Novel extends Book {
    private String type;

    public Novel( String author, String title , int numberOfPages, String type){
        super(author, title,  numberOfPages);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
