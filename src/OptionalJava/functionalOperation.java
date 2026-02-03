package OptionalJava;

import javax.xml.transform.Source;
import java.util.Optional;

public class functionalOperation {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        Optional<String> nullOptional = Optional.ofNullable(null);

        // ifPresent() :- ye cheak karne ke liye use hota hai ki optional me value hai ya nahi value hai to kuch kar lo
        name.ifPresent((value) ->{
            System.out.println(value);
            System.out.println("Hey");
        });

        nullOptional.ifPresent((valuenull) -> {
            System.out.println(valuenull);
            System.out.println("Hey User");
        });


        // map()
      Optional<String>  uppercase = name.map((value) -> value.toUpperCase());
        System.out.println(uppercase.orElse("default"));

        Optional<String>  uppercasenull = nullOptional.map((value) -> value.toUpperCase());
        System.out.println(uppercasenull.orElse("default"));


        // filter()
        Optional<String> temp = name.filter(n -> n.startsWith("F"));
        temp.ifPresent(System.out::println);


        // Combine Operation
        name.filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
