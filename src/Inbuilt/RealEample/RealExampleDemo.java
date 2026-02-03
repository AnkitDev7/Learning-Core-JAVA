package Inbuilt.RealEample;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExampleDemo {
    public static void main(String[] args) {
        // <tittle> costs $<price>
        BiFunction<String,Double,String> formatter = (tittle, price) ->"Tittle :-"+ tittle + " Costs $ :- " + price ;
        System.out.println(formatter.apply("c Programing Book ",30.44));
        System.out.println(formatter.apply("java Book ",9930.44));
        System.out.println(formatter.apply("Python Programing Book ",930.44));
        System.out.println(formatter.apply("CPP Programing Book ",90.44));
        System.out.println(formatter.apply("English Book ",990.44));
        System.out.println("-----------------------------------------------------------------------");

        BiConsumer<String,Double> formatterConsumer = (tittle, price) -> System.out.println("Tittle :-"+ tittle + " Costs $ :- " + price) ;
        formatterConsumer.accept("c Programing Book ",30.44);
        formatterConsumer.accept("java Book ",9930.44);
        formatterConsumer.accept("CPP Programing Book ",90.44);
        formatterConsumer.accept("English Book ",990.44);
        formatterConsumer.accept("Python Programing Book ",930.44);


        // isExpensive
        Predicate<Double>IsExpensive = price -> price > 500 ;
        System.out.println(IsExpensive.test(900.3));
    }
}
