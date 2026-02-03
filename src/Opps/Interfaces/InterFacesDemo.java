package Opps.Interfaces;

public class InterFacesDemo {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();
        e1.applyBreak();
        e1.turnLeft();;
        e1.turnRight();

        carControl myCar = new ElectricCar();
        myCar.applyBreak();
    }
}
