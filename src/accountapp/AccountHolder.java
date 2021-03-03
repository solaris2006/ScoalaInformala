package accountapp;

import java.util.ArrayList;
import java.util.List;

public class AccountHolder<E> implements Printable{
    private String name;
    List<Account> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAcount(Account account){
        accounts.add(account);
    }

    public void print(){
        System.out.println("Name" + getName());
        for (Account account : accounts){
            account.print();
        }
    }
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
