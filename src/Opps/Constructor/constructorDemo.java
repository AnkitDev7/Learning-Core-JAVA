package Opps.Constructor;

public class constructorDemo {
    public static void main(String[] args){
        Bike bike1 = new Bike(" Hero "," Black ",100);
        bike1.bikeDrive();

        Bike bike2 = new Bike(" Honda "," Blue ",190);
        bike2.bikeDrive();

        System.out.println(bike2.getSpeed());
        bike2.setSpeed(900);
        System.out.println(bike2.getSpeed());
    }
}
