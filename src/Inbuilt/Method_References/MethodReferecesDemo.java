package Inbuilt.Method_References;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferecesDemo {
    public static void main(String[] args) {
        // ::
        // 1. Using For Loop
        List<String> names = Arrays.asList("ankit","Dubey","Mohini");
        for (int i = 0;i<names.size() ; i++){
            System.out.println(names.get(i));
        }

        // Using Enhanced for Loop
        for (String name : names){
            System.out.println(name);
        }

        // main Step forEach Loop
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Step 1 :- kam code likhna pade isiliye.
        names.forEach((String name) -> {
            System.out.println(name);
        });

        // step 2
        names.forEach((name) -> {
            System.out.println(name);
        });

        // Step 3
        names.forEach((name) -> System.out.println(name));

        // Step 4 :- This is a MethodReferences
        names.forEach(System.out::println);


        // Demo Method References
        System.out.println("Demo Method Refereces :- ");
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Orange");
        Fruits.add("Mango");
        Fruits.add("Banana");
        Fruits.add("Guava");

        // This is a Method References.
        Fruits.forEach(System.out::println);

    }
}
