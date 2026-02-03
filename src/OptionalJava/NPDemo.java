package OptionalJava;

import java.util.Optional;
import java.util.Scanner;

public class NPDemo {
    public static void main(String[] args) {
        String name = null;
        if (name != null){
            System.out.println(name.length());
        }else {
            System.out.println("No name value");
        }

        // creationg Optional
        Optional<String> optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String > empty = Optional.empty();
        System.out.println(empty);

        Optional<String> MayBe = Optional.ofNullable(null);
        System.out.println(MayBe);


        // Cheaking Value
        System.out.println(optionalString.isPresent());
        System.out.println(MayBe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(MayBe.isEmpty());

        // get();
        System.out.println(optionalString.get());
//        System.out.println(MayBe.get());


        // orElse("Default Value")
        System.out.println(optionalString.orElse("default"));
        System.out.println(MayBe.orElse("Default"));

        // orElseGet(<Supplier>)
        String result = MayBe.orElseGet( () ->{
            System.out.println("Denerationg Default value");
            return "Default";
        });
        System.out.println(result);

        // orElseThrow()
        String newResult = optionalString.orElseThrow(()->
                new RuntimeException("Not Found :- ")
                );


        // user input in Option way
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();   // user kuch bhi likh sakta hai ya blank
        Optional<String> userInput = Optional.ofNullable(input);
        userInput
                .filter(str -> !str.trim().isEmpty())
//                .ifPresent(str -> System.out.println(str.toUpperCase()));
                .orElseGet(() -> {
                    System.out.println("kuch likho yar");
                    return "Default";
                });
        System.out.println(userInput);
    }
}
