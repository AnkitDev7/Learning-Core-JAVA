package Project.BankingManagementSystem.Repository;

import Project.BankingManagementSystem.Domain.Account;
import Project.BankingManagementSystem.Domain.Customer;

import java.util.*;

public class AccountRepository {
    private final Map<String , Account> accountByNumber = new HashMap<>();

    public void Save(Account account){
        accountByNumber.put(account.getAccoutNumber(),account);
    }

    public List<Account> findAll() {
        return new ArrayList<>(accountByNumber.values());
    }

    public Optional<Account> findByNumber(String accountNumber) {
        return Optional.ofNullable(accountByNumber.get(accountNumber));
    }

    public List<Account> findByCustomerId(String customeid) {
        List<Account> result = new ArrayList<>();
        for (Account a :accountByNumber.values()){
            if (a.getCustomerId().equals(customeid)){
                result .add(a);
            }
        }
        return result;
    }
}
