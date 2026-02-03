package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Streams:- Assembly line / pipeline
        List<String> items = Arrays.asList("Apple","Banana" , "fruits");
        for (String fruits : items){
            System.out.println(fruits);
        }

        // Using Streams
        System.out.println("Using stream Print :- ");
        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);


        // filter
        System.out.println("Filter in Stream :- ");
        Stream<String> streamNew = items.stream();
        Stream<String> filterStream = streamNew.filter(name -> name.startsWith("B"));
       filterStream.forEach(System.out::println);


       // short way filter
        System.out.println("Short way in filter :- ");
        List<String> Vegitables = Arrays.asList("Potato","Tomato","Toy","Banana");
        Vegitables.stream()
                .filter(name -> name.startsWith("T"))
                .forEach(System.out::println);


        /*
        Use cases in stream :-
        * 1. filtering
        * 2. Maping
        * 3. Aggregation
        * 4. Iteration
        * 5. Searching
         */
    }
}

