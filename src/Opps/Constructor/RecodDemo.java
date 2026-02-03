package Opps.Constructor;

record Car(String brand, int speed){}

public class RecodDemo {
    public static void main(String[] args){
      Car car1 = new Car("BMW" , 220);
        System.out.println("Brand :- " + car1.brand());
        System.out.println("Speed :- " + car1.speed());
        System.out.println(car1);
    }
}
