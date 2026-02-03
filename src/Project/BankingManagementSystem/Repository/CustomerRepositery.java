package Project.BankingManagementSystem.Repository;

import Project.BankingManagementSystem.Domain.Account;
import Project.BankingManagementSystem.Domain.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositery {
    private final Map<String , Customer> custmerById = new HashMap<>();

    public List<Customer> findAll() {
        return new ArrayList<>(custmerById.values());
    }

    public void save(Customer c) {
        custmerById.put(c.getId(),c);
    }
}
