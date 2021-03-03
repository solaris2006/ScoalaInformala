package accountapp;

public class AccountApp {
    public static void main(String[] args) {
        Account cristianCurrentAccount = new CurrentAccount("current account", "RO50ING23400201", 3000);
        Account cristianSavingsAccount = new SavingsAccount("savings account", "RO33BCR20039329", 1000, 3.5);
        Account cristinaCurrentAccount  = new CurrentAccount("current account", "RO44ING293939993", 500);
        AccountHolder cristian = new AccountHolder("Cristian");
        AccountHolder cristina = new AccountHolder("Cristina");
        cristian.addAcount(cristianCurrentAccount);
        cristian.addAcount(cristianSavingsAccount);
        cristina.addAcount(cristinaCurrentAccount);
        cristina.addAcount(cristianSavingsAccount);

        cristina.deposit(235.05);
        cristina.print();
        cristian.deposit(1500);
        cristina.print();

    }
}
