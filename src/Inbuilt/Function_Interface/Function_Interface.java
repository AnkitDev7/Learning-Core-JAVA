package Inbuilt.Function_Interface;

import java.util.function.Function;

public class Function_Interface {

    // Function Interface
    public static Function<Integer,Integer> addFunction = (a) ->a + 5;
    public static Function<Integer,Integer> subFunction = (a) -> a - 20;

    public static Function<Integer,Integer> CombinedFunction =
            addFunction.andThen(subFunction);

/*     Function Interface :- Function Interface tab hi use hota hai jab ek hi input lena hai aur
    ek hi output aayega tab Function Interface use hoga.
*/
    public static void main(String[] args) {
        System.out.println(addFunction.apply(10));
        System.out.println(subFunction.apply(90));
        System.out.println(CombinedFunction.apply(10));
    }
}
