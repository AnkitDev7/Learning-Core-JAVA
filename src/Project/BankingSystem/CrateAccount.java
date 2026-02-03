package Project.BankingSystem;

abstract public class CrateAccount {
    private String name;
    private long AccountNumber;
    private String Password;
    private double Balance;

    public void cheackBalance(){
        System.out.println("Current Balance :- " +Balance);
    }


//    public Object[] getAllData() {
//        return new Object[]{name,AccountNumber,Password,Balance};
//    }


    public double getBalance() {
        return Balance;
    }

    public String getPassword() {
        return Password;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public String getName() {
        return name;
    }

    public abstract void Deposite(double amaount);
    public abstract void withdraw(double amaunt);

    public CrateAccount(String name,long AccountNumber , String Password , double Balance) {
        this.name = name;
        this.AccountNumber = AccountNumber;
        this.Password = Password;
        this.Balance = Balance;
    }
}
