package Opps.classObjectDemo;

public class Car {
    String brand;
    String color;
    int speed;

    public void drive(){
        System.out.println(brand + color + " color is driving at " + speed);
    }
}

// Aise bhi ho sakta hai but aise karna acha practise nahi hota hai Java mai;
class Abc {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.speed = 100;
        car1.brand = " Toyota ";
        car1.color = "Red";car1.drive();

        Car car2 = new Car();
        car2.brand = " Tesla ";
        car2.color = "Black";
        car2.speed = 190;
        car2.drive();
    }
}