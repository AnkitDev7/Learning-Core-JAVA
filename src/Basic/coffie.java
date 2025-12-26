package Basic;

import java.util.Scanner;

public class coffie {
    public static void main(String[] args){
        while (true){
            System.out.println("-------------------------Welcome-------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice:-  ");
            System.out.println("(1).Tea , (2).Coffee , (3).Paratha");
            int num = sc.nextInt();
            System.out.println("Choice :- "+num);
            int choose = num;
            System.out.println("---------------------------------------------------------");
            if(choose <= 1){
                System.out.println("Choose Your Favourite Tea");
                System.out.println("Black Tea :- 20 ");
                System.out.println("Lemon Tea :- 40 ");
                System.out.println("Milk Tea :- 60 ");

                System.out.println("---------------------------------------------------------");
                System.out.println("Enter Your Favourite Tea Price");
                int Tea = sc.nextInt();

                if(Tea <=20){
                    System.out.println("Bayetho Table pe Black Tea ja raha hai aapka ");
                    System.out.println("---------------------------------------------------------");
                }else if(Tea <=40){
                    System.out.println("Bayetho Table pe Lemon Tea ja raha hai  Aapka");
                    System.out.println("---------------------------------------------------------");
                }else if (Tea <=60){
                    System.out.println("Bayetho Table pe Milk Tea ja raha hai Aapka");
                    System.out.println("---------------------------------------------------------");
                }

            }else if(choose <= 2){
                System.out.println("Choose Your Favourite Coffee");
                System.out.println("Milk Coffee :- 40");
                System.out.println("Normal Coffee :- 60");
                System.out.println("Cold Coffee :- 80");

                System.out.println("---------------------------------------------------------");
                System.out.println("Enter Your Favourite Coffee Price");
                int coffee = sc.nextInt();

                if(coffee <=40){
                    System.out.println("Bayetho Table pe Milk Coffee ja raha hai aapka ");
                    System.out.println("---------------------------------------------------------");
                }else if(coffee <=60){
                    System.out.println("Bayetho Table pe Normal coffee ja raha hai  Aapka");
                    System.out.println("---------------------------------------------------------");
                }else if (coffee <=80){
                    System.out.println("Bayetho Table pe Cold coffee ja raha hai Aapka");
                    System.out.println("---------------------------------------------------------");
                }

            }else if(choose <= 3){
                System.out.println("Choose Your Favourite Paratha");
                System.out.println("Aalu Paratha :- 40");
                System.out.println("Onion Paratha :- 60");
                System.out.println("Gobhi Paratha :- 50");


                System.out.println("---------------------------------------------------------");
                System.out.println("Enter Your Favourite Aalu Paratha Price");
                int aaluParatha = sc.nextInt();

                if(aaluParatha <=40){
                    System.out.println("Bayetho Table pe Black Aalu Paratha ja raha hai aapka ");
                    System.out.println("---------------------------------------------------------");
                }else if(aaluParatha <=60){
                    System.out.println("Bayetho Table pe Onion Paratha ja raha hai  Aapka");
                    System.out.println("---------------------------------------------------------");
                }else if (aaluParatha <=50){
                    System.out.println("Bayetho Table pe Gobhi Paratha ja raha hai Aapka");
                    System.out.println("---------------------------------------------------------");
                }
            }else {
                System.out.println("Wrong Choice");
            }
        }

    }
}