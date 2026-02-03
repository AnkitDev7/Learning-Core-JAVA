package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondStrream {
    public static void main(String[] args) {
        List<Integer> Number = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // ITTERATION 1 - List : EVEN Number from "numbers List"
        List<Integer> EvenNumber = new ArrayList<>();
        for (int evenNum : Number){
            if (evenNum % 2 == 0){
                EvenNumber.add(evenNum);
            }
        }
        System.out.println("Even Number Without Stream :- " + EvenNumber);

        // ITTERATION 2 - use in stream
        Stream<Integer> integerStream1 = Number.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p2);
        List<Integer> evenNumber2 = integerStream2.toList();
        System.out.println("Even number With Stream 2 :" + evenNumber2);


        // ITTERATION 3
        List<Integer> evenNumber3 = Number.stream()
                .filter(p2)
                .toList();
        System.out.println("Even number With Stream 2 :" + evenNumber3);

    }

    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int reminder = integer % 2 ;
            if (reminder == 0)
                return true;
            return false;
        }
    };

    static Predicate<Integer>  p2 = (integer)  -> integer % 2 == 0;
}
