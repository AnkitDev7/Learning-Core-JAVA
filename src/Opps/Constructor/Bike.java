package Opps.Constructor;

public class Bike {
    String brand;
    String color;
    int speed;

    /*
    Java me constructor ek special method hota hai jo object create hote hi automatically
     call hota hai. Iska use object ki initial values set karne ke liye hota hai.
     Constructor ka naam class ke naam jaisa hota hai aur iska koi return type nahi hota.
     Java me mainly default aur parameterized constructor use hote hain.

    1. Default Constructor
       Jo compiler automatically bana deta hai jab hum class me koi constructor nahi likhte.

    2. No-Argument Constructor
       Jo hum khud banate hain lekin usme koi parameter nahi hota.

   3. Parameterized Constructor
       Jisme parameters pass karke object ko initial value dete hain.
     */
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
