package Project.BankingManagementSystem.Impl;

import Project.BankingManagementSystem.Domain.Account;
import Project.BankingManagementSystem.Domain.Customer;
import Project.BankingManagementSystem.Domain.Transaction;
import Project.BankingManagementSystem.Domain.Type;
import Project.BankingManagementSystem.Exception.AccoundNotFoundException;
import Project.BankingManagementSystem.Exception.ValidationException;
import Project.BankingManagementSystem.Exception.insufficientFundsException;
import Project.BankingManagementSystem.Repository.AccountRepository;
import Project.BankingManagementSystem.Repository.CustomerRepositery;
import Project.BankingManagementSystem.Repository.TransactionRepository;
import Project.BankingManagementSystem.Utilation.Validation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService{

    private final AccountRepository accountRepository = new AccountRepository();
    private final TransactionRepository transactionRepository = new TransactionRepository();
    private final CustomerRepositery customerRepositery = new CustomerRepositery();

    private final Validation<String> validationName = name -> {
        if (name == null || name.isBlank()) throw new ValidationException("Name is Required");
    };

    private final Validation<String> validateEmail =email -> {
        if (email == null || !email.contains("@")) throw new ValidationException("Name is Required");
    };

    private final Validation<Type> validateAccount = account -> {
        if (account == null ||
                (account != Type.SAVING && account != Type.CURRENT)) {

            throw new ValidationException("Invalid Account Type");
        }
    };

    private final Validation<Double> validateAmountPositive =amount -> {
        if (amount == null || amount <= 0) {
            throw new ValidationException("Please enter the valid Amount :- ");
        };
    };


    @Override
    public String openAccount(String name, String email, Type accountType) {
        validationName.validate(name);
        validateEmail.validate(email);
        validateAccount.validate(accountType);

        String customerId = UUID.randomUUID().toString();

        // CREATE CUSTOMER
        Customer c = new Customer(customerId, name, email);

        customerRepositery.save(c);

        // CHANGE LATER ---> 10 + 1 = AC000011 ---> AC<06>
      //  String AccoutNumber = UUID.randomUUID().toString();
        String accoutNumber = getAccoutNumber();
        Account account = new Account(accoutNumber,accountType,0,customerId);

        // SAVE the Data
        accountRepository.Save(account);
        return accoutNumber ;
    }


    @Override
    public List<Account> listAccounts() {
        return accountRepository.findAll().stream()
                .sorted(Comparator.comparing(Account::getAccoutNumber))
                .collect(Collectors.toList());
    }

    @Override
    public void deposite(String accountNumber, double amount, String note) {
        validateAmountPositive.validate(amount);

        Account account = accountRepository.findByNumber(accountNumber)
                .orElseThrow(()->new AccoundNotFoundException("Account not found" +accountNumber));
        account.setBalance(account.getBalance() + amount);
        Transaction transaction = new Transaction(account.getAccoutNumber(),
                amount, UUID.randomUUID().toString(), note, LocalDateTime.now(), Type.DEPOSIT);
        transactionRepository.add(transaction);
    }

    @Override
    public void withdraw(String accountNumber, double amount, String userNote) {
        validateAmountPositive.validate(amount);

        Account account = accountRepository.findByNumber(accountNumber)
                .orElseThrow(()->new AccoundNotFoundException("Account not found" +accountNumber));
        if (amount <= 0) {
            throw new insufficientFundsException("Invalid amount");
        }
        if (account.getBalance() < amount) {
            throw new insufficientFundsException("Insufficient Balance");
        }
        account.setBalance(account.getBalance() - amount);
        Transaction transaction = new Transaction(account.getAccoutNumber(),
                amount, UUID.randomUUID().toString(),userNote, LocalDateTime.now(), Type.WITHDRAW);
        transactionRepository.add(transaction);
    }

    @Override
    public void transfer(String fromAcc, String toAcc, double amount, String userNote) {
        validateAmountPositive.validate(amount);

        if (fromAcc.equals(toAcc)){
            throw new ValidationException("Can not transfer to your Own account");
        }
        Account from = accountRepository.findByNumber(fromAcc)
                .orElseThrow(()->new AccoundNotFoundException("Account not found" + fromAcc));
        Account to = accountRepository.findByNumber(toAcc)
                .orElseThrow(()->new AccoundNotFoundException("Account not found" + toAcc));

        if (amount <= 0) {
            throw new insufficientFundsException("Invalid amount");
        }
        if (from.getBalance() < amount) {
            throw new insufficientFundsException("Insufficient Balance");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        Transaction fromTransaction = new Transaction(from.getAccoutNumber(),
                amount, UUID.randomUUID().toString(),userNote, LocalDateTime.now(), Type.TRSNSFER_OUT);
        transactionRepository.add(fromTransaction);

        Transaction toTransaction = new Transaction(to.getAccoutNumber(),
                amount, UUID.randomUUID().toString(),userNote, LocalDateTime.now(), Type.TRANSFER_IN);
        transactionRepository.add(toTransaction);
    }

    @Override
    public List<Transaction> getStatement(String acount) {
        return transactionRepository.findByAccount(acount).stream()
                .sorted(Comparator.comparing(Transaction::getTimestamp))
                .collect(Collectors.toList());
    }

    @Override
    public List<Account> searchAccountByCustomerName(String q) {

        String query =(q == null) ? "" : q.toLowerCase();

     /*   List<Account> result = new ArrayList<>();
        for (Customer c : customerRepositery.findAll()){
            if (c.getName().toUpperCase().contains(query)){
                result .addAll(accountRepository.findByCustomerId(c.getId()));
            }
        }
        result.sort(Comparator.comparing(Account::getAccoutNumber));
        return result;


        return customerRepositery.findAll().stream()
                .filter(c -> c.getName().toLowerCase().contains(query))
               .flatMap(c -> accountRepository.findByCustomerId(c.getId()).stream())
                .sorted(Comparator.comparing(Account::getAccoutNumber))
                .collect(Collectors.toList());
*/

        return customerRepositery.findAll().stream()

                .filter(c -> c.getName() != null &&
                        c.getName().toLowerCase().contains(query))

                .flatMap(c -> {
                    List<Account> accounts =
                            accountRepository.findByCustomerId(c.getId());
                    return accounts.stream();
                })

                .sorted(Comparator.comparing(Account::getAccoutNumber))

                .toList();
    }

    private String getAccoutNumber() {
        int size = accountRepository.findAll().size() + 1;
        String accoutNumber = String.format("AC%06d",size);
        return accoutNumber;
    }
}
