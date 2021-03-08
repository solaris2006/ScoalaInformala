package accountapp;

public class SavingsAccount extends Account implements Printable, Deposit{
    private double interestRate;

    public SavingsAccount(String description, String iban, double balance, double interestRate) {
        super(description, iban, balance);
        this.interestRate = interestRate;
    }


    public void print(){
        System.out.println("Account type " + this.getDescription());
        System.out.println("IBAN " + this.getIban());
        System.out.printf("Balance %.2f"  , this.getBalance());
        System.out.println();
        System.out.println("Interest rate " + this.interestRate);
    }

    public void deposit(double amount){
        double newBalance = this.getBalance() + amount;
        double monthyInterestRate =  ((this.interestRate / 100) / 12);
        this.setBalance(((newBalance * monthyInterestRate) * 3) + newBalance);
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
