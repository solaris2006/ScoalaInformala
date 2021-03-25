package collections;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String hobby;
    private int frequency;
    List<Address> addresses = new ArrayList<>();

    public Hobby(String hobby, int frequency) {
        this.hobby = hobby;
        this.frequency = frequency;

    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Address> getAddresses() {

        for (Address adrres :  addresses){
            System.out.print(adrres.getCity() + " ");
        }

        return addresses;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }
}
