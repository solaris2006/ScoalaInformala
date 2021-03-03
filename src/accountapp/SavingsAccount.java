package accountapp;

public class SavingsAccount extends Account implements Printable{
    private double interestRate;

    public SavingsAccount(String description, String iban, int balance, double interestRate) {
        super(description, iban, balance);
        this.interestRate = interestRate;
    }


    public void print(){
        System.out.println("Account type" + this.getDescription());
        System.out.println("IBAN " + this.getIban());
        System.out.println("Balance"  + this.getBalance());
        System.out.println("Interest rate " + this.interestRate);
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
