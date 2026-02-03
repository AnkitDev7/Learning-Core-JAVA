package Opps.Abstraction;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        System.out.println( + amount + " Ruppes Deposited Sucessfully ");
    }

    @Override
    public void withdraw(double amount){
        System.out.println( amount + " Rupees Withdraw Deposited Successfully");
    }

}
