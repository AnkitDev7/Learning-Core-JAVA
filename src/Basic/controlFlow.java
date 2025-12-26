package Basic;

public class controlFlow {
        /*
==========================================================
        CONTROL FLOW IN JAVA
==========================================================

🔹 What is Control Flow?
Control flow means how your program executes statements
based on conditions or loops. Instead of running code line
by line blindly, you can tell Java:

✅ “Do this if something is true.”
🔄 “Repeat this until a condition changes.”
🔀 “Choose one path from many.”

Java gives us three main types:
1. Decision-making → if, else if, else, switch
2. Loops (Iteration) → for, while, do-while, enhanced for-each
3. Jump statements → break, continue
*/
    public static void main(String[] args){
        // if-else
        int age = 16;
        if(age > 18){
            System.out.println("Welcome to Your bank");
        }else{
            System.out.println("Try again when you turn 18");
        }

        // if-else ladder
        int mark = 50;
        if (mark > 90){
            System.out.println("Grade A+ ");
        } else if (mark > 75) {
            System.out.println("Grade A ");
        } else if (mark > 60) {
            System.out.println("Grade B ");
        }else {
            System.out.println("Grade F ");
        }

        // switch Case
        String day = "Tuesday";
        switch (day){
            case "Monday"-> System.out.println("Start of the Week");
            case "Friday"-> System.out.println("Last day of the Week");
            default -> System.out.println("Enjoy Weekend");
        }

        // Loops in Java

        // FOR loop
        for (int i = 1; i < 11 ;i++){
            System.out.println("2 x "+i + " = " + 2*i );
        }

        // While Loop
        int num = 3;
        while (num > 0){
            System.out.println("Num:- " + num);
            num--;
        }

        // Do while loop
        int n = 3;
        do{
            System.out.println("n:- " +n);
            n--;
        }while (n > 0);

        // Enhanced for each
        String[] fruits = {"Apple","Banana","Orange","Guava","PineAple","Potato","Tomato"};
        for(String a : fruits){
            System.out.println("Fruits:- " + a);
        }
        for(int i = 0; i<fruits.length;i++){
            System.out.println("Fruit = " + fruits[i]);
        }

        // break Statement / JUMP matlab continue Statement
        for (int i = 0; i < 10; i++){
            if(i == 3) continue;
            if(i == 6) break;
            System.out.println("Count: " + i);
        }

    }
}
