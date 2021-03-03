package collections;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String hobby;
    private int frequency;
    List<Address> addresses ;

    public Hobby(String hobby, int frequency, List<Address> addresses) {
        this.hobby = hobby;
        this.frequency = frequency;
        this.addresses = addresses;
    }


}
