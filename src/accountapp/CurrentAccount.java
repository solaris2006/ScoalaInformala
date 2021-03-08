package accountapp;

public class CurrentAccount extends Account implements Print, Deposit{
    private boolean overDraftEligible;

    public CurrentAccount(String description, String iban, double balance) {
        super(description, iban, balance);
        this.overDraftEligible = isOverDraftEligible();
    }


    public boolean isOverDraftEligible() {
        return this.getBalance() > 1000;
    }

    public void deposit(double amount){}

    public void print(){
        System.out.println("Account type " + this.getDescription());
        System.out.println("IBAN " + this.getIban());
        System.out.println("Balance "  + this.getBalance());
        if (isOverDraftEligible()) {
            System.out.println("Is allowed for overdraft");
        } else {
            System.out.println("Is not allowed for overdraft");
        }
    }

}
