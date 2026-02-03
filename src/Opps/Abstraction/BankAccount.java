package Opps.Abstraction;

 abstract public class BankAccount {
    private String accountNumber;
    private double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Constructor
     public BankAccount(String accountNumber , double balance) {
         this.accountNumber = accountNumber;
         this.balance = balance;
     }

     // getter
     public String getAccountNumber() {
         return accountNumber;
     }

     // setter
     public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
     }
 }
