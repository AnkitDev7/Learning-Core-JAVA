package Opps.encapsulatoin;

     class Bike {
       private String brand;
       private String color;
       private int speed;

        public Bike(String brand , String color , int speed){
            this.brand = brand;
            this.color = color;
//            this.speed = speed;
            setSpeed(speed);
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
            if (speed < 0)
                speed = 0 ;
            this.speed = speed;
        }
    }

    public class EncapselationDemo {
        public static void main(String[] args) {
            Bike bike1 = new Bike(" toyota ","Red" , 120);
            bike1.setSpeed(-200);
            bike1.bikeDrive();

            Bike bike2 = new Bike("Kiya" , "Black" , 220);
            bike1.bikeDrive();
        }

}

