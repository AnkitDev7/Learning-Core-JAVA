package Opps.Inheritence;

public class Car extends Vihicle {
    private int doors;

    public Car(String brand , int speed , int doors){
        super(brand , speed);
        this.doors = doors;
    }

    @Override
    public void displayInfo(){
//        super.displayInfo();
        System.out.println("Brand :- "  + getBrand() + "Speed :- " + getSpeed() + " hm/hr " + doors + " doors ");
    }
}
