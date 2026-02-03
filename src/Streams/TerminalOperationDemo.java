package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        List<Integer> Number = Arrays.asList(10,20,30,40,50,60,70,55,66,80,90);
        /*
        reduce():- Java me reduce() ka matlab hai: Bahut saari values ko process karke ek single final value banana
        Input: many values
        Output: one value
         */
        Stream<Integer> integerStream = Number.stream();
//        int sum = integerStream.reduce(0,(acc,num) -> acc + num);
        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("SUM :- " +sum);

        /*
        Collect():- collect() ka kaam hota hai:
        data ko ikatta (collect) karna
        aur use kisi container me daal dena
         */
        List<Integer> evenNumbers = Number.stream()
                .filter(n-> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Number :- " +evenNumbers);

        Set<Integer> evenNumbersSet = Number.stream()
                .filter(n-> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Even Number :- " +evenNumbersSet);


        // find & match
        System.out.println(Number.stream().findFirst().get());
        System.out.println(Number.stream().findAny().get());

        boolean has40 = Number.stream()
                .anyMatch(n -> n == 40);
        System.out.println(has40);

        // iteration
        Number.stream()
                .forEach(System.out::println);
    }
}
