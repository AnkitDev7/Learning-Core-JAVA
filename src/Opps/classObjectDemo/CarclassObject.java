package Opps.classObjectDemo;

import java.util.Date;

public class CarclassObject {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.speed = 100;
        car1.brand = " Toyota ";
        car1.color = "Red";
        car1.drive();

        Car car2 = new Car();
        car2.brand = " Tesla ";
        car2.color = "Black";
        car2.speed = 190;
        car2.drive();

        Date date = new Date();
        date.toLocaleString();
        System.out.println(date);
    }
}
