package Streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiffrentSourceDemo {
    /*
    From Collection :-  eg, collection.stream();
    From Array:- eg, Arrays.stream(array);
    From Specific Value:- eg, Stream.of("a","b","c");
    From Function:- eg, Stream.iterate(0,n->n+2);
    From File :- eg, File.Lines(path);
    Empty Stream:- eg, Stream.empty();
     */
    public static void main (String[] args) throws IOException {
//        From Collection :-  eg, collection.stream();
        System.out.println("Collection Stream :- ");
        List<Integer> Number = Arrays.asList(1,3,4,5,6,7,8,9,2);
        Stream<Integer> integerStream = Number.stream();
        integerStream.forEach(System.out::println);

//        From Array:- eg, Arrays.stream(array);
        System.out.println("Array Stream :- ");
        int [] NumberArray = {1,2,3,4,6,6,7};
        IntStream StreamArray = Arrays.stream(NumberArray);
        StreamArray.forEach(System.out::println);

//        From Specific Value:- eg, Stream.of("a","b","c");
        Stream<String> stringDemo = Stream.of("ankit","Kumar","Dubey");
        stringDemo.forEach(System.out::println);

//        From Function:- eg, Stream.iterate(0,n->n+2);
        System.out.println("Function Stream :- ");
        Stream<Integer> integerStream1 = Stream.iterate(0,n -> n + 2);
        integerStream1.forEach(System.out::println);

//        From File :- eg, File.Lines(path);
        System.out.println("File Stream :- ");
        try {
            Stream<String> fileStream = Files.lines(Path.of("PATH"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Empty Stream:- eg, Stream.empty();
        System.out.println("Empty Stream :- ");
        Stream<String> EmptyStream = Stream.empty();

    }
}
