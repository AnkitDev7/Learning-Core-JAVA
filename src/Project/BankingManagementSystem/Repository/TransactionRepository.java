package Project.BankingManagementSystem.Repository;

import Project.BankingManagementSystem.Domain.Transaction;

import java.util.*;

public class TransactionRepository {
    private final Map<String, List<Transaction> > txByAccount = new HashMap<>();

    public void add(Transaction transaction) {
     List<Transaction> list =  txByAccount.computeIfAbsent(transaction.getAccountNumber(),
             k -> new ArrayList<>()
     );
     list.add(transaction);
    }

    public List<Transaction> findByAccount(String acount) {
        return new ArrayList<>(txByAccount.getOrDefault(acount ,Collections.emptyList()));
    }
}
