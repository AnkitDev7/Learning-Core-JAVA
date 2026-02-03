package Inbuilt.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
/*     Bifunction :- Bifunction ek aisa functional interface hai jo accept karta hai 2 argument
    aur produce karta hai 1 Result
*/

    public static BiFunction<Integer , Integer , Integer> addFunction = (a,b)->{
        return a + b;
    };

    public static BiFunction<Integer,Integer,Integer> subFunction = (a,b) -> {
        int sub = a - b;
        return sub;
    };

public static void main(String[] args) {
    System.out.println(addFunction.apply(20,20));
    System.out.println(subFunction.apply(90,10));

    Function<Integer,Integer> MultiplyBy2 = X -> X * 2 ;
    BiFunction<Integer,Integer,Integer> combinFunction = addFunction.andThen(MultiplyBy2);

    System.out.println(combinFunction.apply(2,5));
}
}
