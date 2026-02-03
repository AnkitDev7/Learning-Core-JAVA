package Opps.Interfaces;

public class ElectricCar implements carControl{


    @Override
    public void turnRight() {
        System.out.println("Electric Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Left");
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }
}
