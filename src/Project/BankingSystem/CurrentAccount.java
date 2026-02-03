package Project.BankingSystem;

public class CurrentAccount extends CrateAccount{

    public CurrentAccount(String name, long AccountNumber, String Password, double Balance) {
        super(name, AccountNumber, Password, Balance);
    }

    public double balance = 0;

    @Override
    public void Deposite(double amaount) {
        balance += amaount;
        System.out.println("Deposite Balance :- " + balance);
    }

    @Override
    public void withdraw(double amaunt) {
        balance -= amaunt;
        System.out.println("Withdraw Your Balance :- " + balance);
    }
}
