package Opps.Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("adkdfjdsd" , 900);
        savingAccount.deposit(100);

        BankAccount currentAcount1 = new CurrentAccount("djksjfd" , 800);
        currentAcount1 = new CurrentAccount("ankit" , 500);
        currentAcount1.deposit(200);
        currentAcount1.withdraw(500);

        System.out.println(currentAcount1.getAccountNumber());
        currentAcount1 = new SavingAccount("saving", 1000);
        System.out.println(currentAcount1.getAccountNumber());
    }
}
