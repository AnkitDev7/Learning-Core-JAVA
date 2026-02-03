package Project.BankingManagementSystem.Impl;

import Project.BankingManagementSystem.Domain.Account;
import Project.BankingManagementSystem.Domain.Transaction;
import Project.BankingManagementSystem.Domain.Type;

import java.util.List;
import java.util.Objects;

public interface BankService {
    String openAccount(String name, String email, Type AccountType);
    List<Account>listAccounts();

    void deposite(String accountNumber, double amount, String note);
    void withdraw(String accountNumber, double amount, String userNote);
    void transfer(String from, String to, double amount, String userNote);
    List<Transaction> getStatement(String acount);
    List<Account> searchAccountByCustomerName(String q);
}
