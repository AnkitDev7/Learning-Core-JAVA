package Project.BankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    Scanner Sc = new Scanner(System.in);

    static void createAccount(Bank bank) {
        System.out.println("------------------------------------------------------------");
        System.out.println("                     Welcome To My Bank :-                  ");
        System.out.println("------------------------------------------------------------");

        ArrayList<SavingAccount> savingList = new ArrayList<>();
        ArrayList<CurrentAccount> currentList = new ArrayList<>();

        while (true){
            System.out.println("1. Create Account :- ");
            System.out.println("2. Login :- ");
            System.out.println("3. Exit :- ");

            System.out.println("----------------------------");
            System.out.println("Choose Your Choice :- ");
            int choose = bank.Sc.nextInt();
            System.out.println("Your Choice :- " + choose);

            switch (choose){
                case 1:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("                1. Current Account :- ");
                    System.out.println("                2. Saving  Account :-  ");
                    System.out.println("---------------------------------------------------------");

                    System.out.println("Choose Your Create Account Type :- ");
                    int accountType = bank.Sc.nextInt();
                    bank.Sc.nextLine();
                    System.out.println("Choose Account Type :- " + accountType);
                    System.out.println("----------------------------");

                    if (accountType == 1) {
                        System.out.println("Enter Your Name :- ");
                        String name = bank.Sc.nextLine();
                        System.out.println("Your Name :- " +name);
                        System.out.println("----------------------------");

                        System.out.println("Enter Your Account Number :- ");
                        long accountNo = bank.Sc.nextLong();
                        bank.Sc.nextLine();
                        System.out.println("Your Account No :- " + accountNo);
                        System.out.println("----------------------------");

                        System.out.println("Enter Your Password :- ");
                        String password = bank.Sc.nextLine();
                        System.out.println("Your Password :- " +password);
                        System.out.println("----------------------------");

                        System.out.println("Enter Your Balance :- ");
                        double balance = bank.Sc.nextDouble();
                        System.out.println("Your Account Balance :- " + balance);
                        System.out.println("----------------------------");


                        System.out.println("--------------------------------------------------------");
                        System.out.println("        Your Current Account Bank Full Details....      ");
                        System.out.println("      -----------------------------------------------   ");
                        System.out.println("Your Name :- " + name);
                        System.out.println("Account Number :- " + accountNo);
                        System.out.println("Your Password  :- " +password);
                        System.out.println("Bank Balance   :- " +balance);
                        System.out.println("----------------------------------------------");


                        CurrentAccount currentAccount =
                                new CurrentAccount(name, accountNo, password, balance);

                        currentList.add(currentAccount);
                    }

                    else if (accountType == 2) {
                        System.out.println("Enter Your Name :- ");
                        String name = bank.Sc.nextLine();
                        System.out.println("Your Name :- " +name);
                        System.out.println("----------------------------");

                        System.out.println("Enter Your Account Number :- ");
                        long accountNo = bank.Sc.nextLong();
                        bank.Sc.nextLine();
                        System.out.println("Your Name :- " +accountNo);
                        System.out.println("----------------------------");

                        System.out.println("Enter Your Password :- ");
                        String password = bank.Sc.nextLine();
                        System.out.println("Your Name :- " +password);
                        System.out.println("----------------------------");

                        System.out.println("Enter Your Balance :- ");
                        double balance = bank.Sc.nextDouble();
                        System.out.println("Your Balance :- " + balance);
                        System.out.println("---------------------------------");

                        System.out.println("----------------------------------------------");
                        System.out.println("        Your Current Back Full Details....    ");
                        System.out.println("----------------------------------------------");
                        System.out.println("Your Name :- " + name);
                        System.out.println("Account Number :- " + accountNo);
                        System.out.println("Your Password  :- " +password);
                        System.out.println("Bank Balance   :- " +balance);
                        System.out.println("----------------------------------------------");

                        SavingAccount savingAccount =
                                new SavingAccount(name, accountNo, password, balance);

                        savingList.add(savingAccount);

                    }else {
                        System.out.println("       Wrong Account Type Choose...      ");
                        System.out.println("-------------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("-------------------------------------");
                    bank.Sc.nextLine();
                    System.out.println("Enter Your Name :- ");
                    String UserName = bank.Sc.nextLine();

                    System.out.println("Enter Your Password :- ");
                    String UserPassword = bank.Sc.nextLine();

                    boolean login = false;

                    //  Saving Account check
                    for (SavingAccount acc : savingList) {
                        if (acc.getName().equals(UserName) &&
                                acc.getPassword().equals(UserPassword)) {

                            accountBalance(bank, acc);

                            login = true;
                            break;
                        }
                    }

                    // Current Account check (sirf tab jab saving me nahi mila)
                    if (!login) {
                        for (CurrentAccount acc : currentList) {
                            if (acc.getName().equals(UserName) &&
                                    acc.getPassword().equals(UserPassword)) {

                                System.out.println("Login Successful...");
                                System.out.println("Account Type :- CURRENT ACCOUNT");

                                currentAccount(bank,acc);
                                login = true;
                                break;
                            }
                        }
                    }

                    if (!login) {
                        System.out.println("Your UserName and Password Wrong....");
                    }
                    break;

            }

        }

    }

    // Saving Account Method
    private static void accountBalance(Bank bank, SavingAccount acc) {
        System.out.println("-------------------------------------");
        System.out.println("Login Successful...");
        System.out.println("Account Type :- SAVING ACCOUNT");
        System.out.println("-------------------------------------");

        System.out.println("              Login Menu:-           ");
        System.out.println("1. Deposite Your Balance :- ");
        System.out.println("2. Withdraw Your Balance :- ");
        System.out.println("3. Cheack Bank Balance :- ");
        System.out.println("-------------------------------------");

        System.out.println("Enter Your Choice :- ");
        int yourChoice = bank.Sc.nextInt();

        switch (yourChoice) {

            case 1:
                System.out.println("Enter Deposit Amount :- ");
                double depAmount = bank.Sc.nextDouble();
                acc.Deposite(depAmount);
                break;

            case 2:
                System.out.println("Enter Withdraw Amount :- ");
                double withAmount = bank.Sc.nextDouble();
                acc.withdraw(withAmount);
                break;

            case 3:
                System.out.println("Your Balance :- " + acc.getBalance());
                break;

            default:
                System.out.println("Wrong Choice...");
        }

    }

    // Current Account Method
    private static void currentAccount(Bank bank, CurrentAccount acc) {
        System.out.println("-------------------------------------");
        System.out.println("Login Successful...");
        System.out.println("Account Type :- SAVING ACCOUNT");
        System.out.println("-------------------------------------");

        System.out.println("              Login Menu:-           ");
        System.out.println("1. Deposite Your Balance :- ");
        System.out.println("2. Withdraw Your Balance :- ");
        System.out.println("3. Cheack Bank Balance :- ");
        System.out.println("-------------------------------------");

        System.out.println("Enter Your Choice :- ");
        int yourChoice = bank.Sc.nextInt();

        switch (yourChoice) {

            case 1:
                // Deposite
                System.out.println("Enter Deposite Amount :- ");
                double depAmount = bank.Sc.nextDouble();

                double totalAmount = depAmount + acc.getBalance();
                acc.Deposite(totalAmount);
                break;

            case 2:
                // Withdraw
                System.out.println("Enter Withdraw Amount :- ");
                double withAmount = bank.Sc.nextDouble();
                double totalWithdraw = acc.getBalance() - withAmount;
                acc.withdraw(totalWithdraw);
                break;

            case 3:
                // Check Balance
                System.out.println("Your Balance :- " + acc.getBalance());
                break;

            default:
                System.out.println("Wrong Choice...");
        }
    }
}

