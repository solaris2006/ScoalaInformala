package accountapp;

import java.util.ArrayList;
import java.util.List;

public class AccountHolder implements Print {
    private String name;
    List<Account> accounts = new ArrayList<>();

    public AccountHolder(String name){
        this.name = name;
    }

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

    public void deposit (double amount){
        // A user choice should be implemented
        for (Account account : accounts){
            if (account instanceof SavingsAccount){
                account.deposit(amount);
            }
        }
    }

    public void print(){
        System.out.println("Name " + getName());
        System.out.println("-------------------");
        for (Account account : accounts){
            account.print();
            System.out.println("------------------");
        }
    }
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
