package accountapp;

import java.awt.print.Printable;

public abstract class Account implements Printable, Deposit{
    private String description;
    private String iban;
    private double balance;


    public Account(String description, String iban, double balance) {
        this.description = description;
        this.iban = iban;
        this.balance = balance;

    }


    public abstract void deposit(double amount);
    public abstract void print();
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
