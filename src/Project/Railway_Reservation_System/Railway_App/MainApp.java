package Project.Railway_Reservation_System.Railway_App;

import Project.Railway_Reservation_System.RailwayAll_Domain.User;
import Project.Railway_Reservation_System.Railway_Implimentation.RailwayService;
import Project.Railway_Reservation_System.Railway_Implimentation.RailwayServiceImpl;
import Project.Railway_Reservation_System.Railway_Repositary.UserRepository;

import java.util.Scanner;

public class MainApp {

    // RESET
    static final String RESET = "\u001B[0m";

    // TEXT COLORS
    static final String BLACK = "\u001B[30m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String RED = "\u001B[31m";
    static final String CYAN = "\u001B[36m";
    static final String PURPLE = "\u001B[35m";

    // BACKGROUND COLORS
    static final String BG_RED = "\u001B[41m";
    static final String BG_GREEN = "\u001B[42m";
    static final String BG_BLUE = "\u001B[44m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RailwayService service = new RailwayServiceImpl();

        System.out.println(RED + "============================================================" + RESET);
        System.out.println(
                BG_BLUE + BLACK + "        Welcome to Railway Reservation System           " + RESET
        );
        System.out.println(RED + "============================================================" + RESET);

        boolean Running = true;

        while (Running) {

            System.out.println(BG_RED + BLACK + " Railway Reservation System Menu Bar :- " + RESET);
            System.out.println(
                    GREEN + """
                            1. Register
                            2. Login
                            3. Exit
                            \s""" + RESET
            );
            System.out.println(CYAN + "----------------------------------" + RESET);

            System.out.print(PURPLE + "Enter Your choice :- " + RESET);
            String choiceInput = sc.nextLine().trim();

            String Choice;
            try {
                Choice = String.valueOf(Integer.parseInt(choiceInput));
            } catch (Exception e) {
                System.out.println(RED + "Invalid choice!" + RESET);
                continue;
            }

            switch (Choice) {
                case "1" -> UserRegistation(String.valueOf(Integer.parseInt(Choice)), sc,service);
                case "2" -> UserLogin(sc, service);
                case "3" -> Running = false;
            }
        }
    }

    // User Login Method
    private static void UserLogin(Scanner sc, RailwayService service) {

        System.out.println(
                BG_GREEN + BLACK + "------------------------------Login Page----------------------------" + RESET
        );

        System.out.print(PURPLE+"Enter Your Username :-  "+RESET);
        String username = sc.nextLine().trim();

        System.out.print(PURPLE+"Enter Your  Password :- "+RESET);
        String password = sc.nextLine().trim();

        User user = UserRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {

            System.out.println(GREEN+"✅ Login Successful!"+RESET);

            System.out.println( GREEN +
                    """
                            1. Search Trains
                            2. Book Ticket
                            3. Cancel Ticket
                            4. View My Booking
                            5. Logout
                            """
             + RESET
            );

            System.out.print(PURPLE+"Enter the Your Choice :- "+RESET);
            String choice = sc.nextLine();

            switch (choice) {
                // case "1" -> SearchTrain(sc, service);
                // case "2" -> BookTitcket(sc);
                default -> System.out.println(RED+"Invalid Choice"+RESET);
            }

        } else {
            System.out.println(RED + " Invalid Username or Password" + RESET);
        }
    }

    // User Registation Method
    private static void UserRegistation(
            String Choice,
            Scanner sc,
            RailwayService service
    ) {

        System.out.println(PURPLE + "Your Choice :- " + Choice + RESET);
        System.out.println(
                BG_GREEN + BLACK + "------------------------------User Registration-----------------------------" + RESET
        );

        System.out.print(YELLOW + "Enter Your Full Name :- " + RESET);
        String Name = sc.nextLine();

        System.out.print(YELLOW + "Enter Your UserName :- " + RESET);
        String userName = sc.nextLine().trim();

        System.out.print(YELLOW + "Enter Your Password :- " + RESET);
        String password = sc.nextLine().trim();

        System.out.print(YELLOW + "Enter Mobile No :- " + RESET);
        String Mobile_No = sc.nextLine().trim();

        System.out.println(
                CYAN + "--------------------------------------------------------------------" + RESET
        );
        System.out.println(
                BG_RED + BLACK + Name + " Your Registraion Full Details :- " + RESET
        );
        System.out.println(PURPLE + "Your Full Name :- " + Name + RESET);
        System.out.println(PURPLE + "Your UserName :- " + userName + RESET);
        System.out.println(PURPLE + "Your Password :- " + password + RESET);
        System.out.println(PURPLE + "Your Mobile_No :- " + Mobile_No);
        System.out.println(
                CYAN + "--------------------------------------------------------------------" + RESET
        );

        service.UserRegister(Name, userName, Mobile_No, password);

        System.out.println(GREEN + " ✔ Registration Successful..." + RESET);
        System.out.println(GREEN + " ➤ Please login to Continue" + RESET);
    }
}
