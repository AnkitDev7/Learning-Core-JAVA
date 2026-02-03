package Inbuilt.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        // BiConsumer :- BiConsumer 2 argument leta hai aur koi result nahi deta hai .
        BiConsumer<Integer , Integer> addConsumer = (a,b) -> {
            System.out.println("Additon :- " +(a + b));
        };
        addConsumer.accept(10,23);
    }
}
