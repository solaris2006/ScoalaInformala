package accountapp;

public class CurrentAccount extends Account implements Printable{
    private boolean overDraftEligible;

    public CurrentAccount(String description, String iban, int balance) {
        super(description, iban, balance);
        this.overDraftEligible = isOverDraftEligible();
    }


    public boolean isOverDraftEligible() {
        return this.getBalance() > 1000;
    }

    public void print(){
        System.out.println("Account type" + this.getDescription());
        System.out.println("IBAN " + this.getIban());
        System.out.println("Balance"  + this.getBalance());
        if (isOverDraftEligible()) {
            System.out.println("Is allowed for overdraft");
        } else {
            System.out.println("Is not allowed for overdraft");
        }
    }

    public void setOverDraftEligible(boolean overDraftEligible) {
        this.overDraftEligible = overDraftEligible;
    }
}
