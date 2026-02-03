package Inbuilt.Supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Supplier :- Represent a supplier of result.
        Supplier<Double> randomNum = () -> Math.random();
        System.out.println(randomNum.get());
    }
}
