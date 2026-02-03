package Project.BankingManagementSystem.Exception;

public class insufficientFundsException extends RuntimeException{
    public insufficientFundsException(String message) {
        super(message);
    }
}
