package Opps.Constructor;

public class Bike {
    String brand;
    String color;
    int speed;

    public Bike(String brand , String color , int speed){
        System.out.println("Constructer is Call");
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

  public void bikeDrive(){
      System.out.println(brand + color + " is drive " + speed);
  }

  // getter
    public int getSpeed() {
        return speed;
    }

    // setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
