package Inbuilt.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer :- Consumer single argument leta hai aur koi result nahi deta hai .
        Consumer<String> consumer1 = (str) -> {
            System.out.println(str);
        };
        consumer1.accept("Welcome to you Consumer :- ");

        Consumer<String> consumer2 = str -> System.out.println(str.length());
        consumer2.accept("Hello");


        List<Integer> numbers = Arrays.asList(1,2,4,5,4,5,6,7);
        Consumer<Integer> multiplyBy2 = n -> System.out.println(n + 2);
        numbers.forEach(multiplyBy2);
    }
}
