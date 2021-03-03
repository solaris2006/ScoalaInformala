package accountapp;

public class AccountApp {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount("current account", "RO50ING23400201", 3000);
        Account savingsAccount  = new SavingsAccount("savings account", "RO33BCR20039329", 1000, 3.5);

    }
}
