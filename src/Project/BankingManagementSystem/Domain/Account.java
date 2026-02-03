package Project.BankingManagementSystem.Domain;

public class Account {
    private String accoutNumber;
    private String customerId;
    private double Balance;
    private Type type;;

    public Account(String accoutNumber, Type type, double Balance, String customerId){
        this.accoutNumber = accoutNumber;
        this.customerId = customerId;
        this.Balance = Balance;
        this.type = type;
    }

    public String getAccoutNumber() {
        return accoutNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public Type getAccountType() {
        return type;
    }


}
