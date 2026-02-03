package Opps.PolymorPhism;

public class PolymororphismDemo {
    public static void main(String[]  args){
        Car car1 = new Car(" Toyota " , 90 , 9);
        car1.displayInfo();

        Bike bike1 = new Bike(" Hero " , 190 , true );
        bike1.displayInfo();

        car1.Start();
        bike1.Start();

        Vihicle v1 = new Vihicle(" Vihcle Brand " , 120);
        v1.Start();

        // Method Overriding (Runtime Polymorophism)
        Vihicle v2 = new Car(" Vihcle Brand " , 120 ,9);
        v2.Start();

        // method Overloading (CompileTime Polymorophism)
        bike1.Start("Hello");
    }
}
