package Project.BankingManagementSystem.App;

import Project.BankingManagementSystem.Domain.Type;
import Project.BankingManagementSystem.Impl.BankService;
import Project.BankingManagementSystem.Impl.BankServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();
        System.out.println("====================================================================");
        System.out.println("                  Welcome to Console Bank :-                        ");
        System.out.println("====================================================================");
        boolean Running = true;
        while (Running){
            System.out.print("""
                     1). Open Account
                     2). Deposite
                     3). Withdraw
                     4). Transfer
                     5). Account Statement
                     6). List Account
                     7). Search Account by Customer Name
                     0). Exit
                """);
            System.out.println("-----------------------------------------");
            System.out.print("Enter Your Choice :- ");
            String Choice = scanner.nextLine().trim();
            System.out.println("Your Choice :- " + Choice);
            System.out.println("-----------------------------------------");

            switch (Choice){
                case "1" -> OpenAccount(scanner , bankService);
                case "2" -> Deposite(scanner , bankService);
                case "3" -> Whithdraw(scanner , bankService);
                case "4" -> Transfer(scanner,bankService);
                case "5" -> AccountStatement(scanner,bankService);
                case "6" -> ListAccount(scanner ,bankService);
                case "7" -> SearchAcountCustomerName(scanner,bankService);
                case "0" -> Running = false;
            }
        }
    }

    private static void OpenAccount(Scanner scanner , BankService bankService) {
        System.out.print("Customer Name :- ");
        String Name = scanner.nextLine().trim();
        System.out.print("Customer Email :- ");
        String Email = scanner.nextLine().trim();
        System.out.print("Account Type (SAVING/CURRENT) :- ");
        Type AccountType = Type.valueOf(scanner.nextLine().trim().toUpperCase());
        System.out.print("Initial deposite (Optional , blank for 0 ) :- ");
        String AmountStr = scanner.nextLine().trim();
        Double initial = Double.valueOf(AmountStr);
       String accountNumber =  bankService.openAccount(Name,Email,AccountType);
       if (initial > 0){
           bankService.deposite(accountNumber,initial,"Initial Deposit");
       }
        System.out.println("-----------------------------------------");
       System.out.println("Account Opened :- " + accountNumber);
       System.out.println("-----------------------------------------");
    }

    private static void Deposite(Scanner scanner , BankService bankService) {
        System.out.print("Enter the Account Number :- ");
        String accountNumber = scanner.nextLine().trim();
        System.out.print("Enter the Ammount :- ");
        double amount = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Enter the details of deposited currency notes:- ");
        String userNote = scanner.nextLine().trim();
        bankService.deposite(accountNumber,amount,userNote);
        System.out.println(" ✅ Deposited Successful");
        System.out.println("-----------------------------------------");
    }

    private static void Whithdraw(Scanner scanner ,BankService bankService) {
        System.out.print("Enter the Account Number :- ");
        String accountNumber = scanner.nextLine().trim();
        System.out.print("Enter the Ammount :- ");
        double amount = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Enter the details of deposited currency notes:- ");
        String userNote = scanner.nextLine().trim();
        bankService.withdraw(accountNumber,amount,userNote);
        System.out.println(" ✅ Withdraw Successful");
        System.out.println("-----------------------------------------");
    }

    private static void Transfer(Scanner scanner ,BankService bankService) {
        System.out.print("From Account Number :- ");
        String from = scanner.nextLine().trim();
        System.out.print("To Account Number :- ");
        String to = scanner.nextLine().trim();
        System.out.print("Enter the Amount :- ");
        double amount = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Enter the details of deposited currency notes:- ");
        String userNote = scanner.nextLine().trim();
        bankService.transfer(from,to, amount,userNote);
    }

    private static void AccountStatement(Scanner scanner , BankService bankService) {
        System.out.print("Enter the Account Number :- ");
        String acount = scanner.nextLine().trim();
        bankService.getStatement(acount).forEach(t -> {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println(t.getTimestamp() + " | " + t.getType() + " | " + t.getAmount() + " | " + t.getNote());
            System.out.println("----------------------------------------------------------------------------------");
        });
    }

    private static void ListAccount(Scanner scanner , BankService bankService) {
        bankService.listAccounts().forEach(a -> {
            System.out.println(a.getAccoutNumber() + "  | " + a.getAccountType() + " | " + a.getBalance());
            System.out.println("-----------------------------------------");
        });
    }

    private static void SearchAcountCustomerName(Scanner scanner ,BankService bankService) {
        System.out.print("Customer name contains :- ");
        String  q = scanner.nextLine().trim();
        System.out.println("-----------------------------------------");
        bankService.searchAccountByCustomerName(q).forEach(account ->
        System.out.println(account.getAccoutNumber() + " | " + account.getAccountType() + " | " + account.getBalance())
        );
        System.out.println("-----------------------------------------");
    }

}
