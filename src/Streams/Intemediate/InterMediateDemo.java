package Streams.Intemediate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class InterMediateDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Basics", 2018, 450.0, "Programming"));
        books.add(new Book("Spring Boot Guide", 2021, 650.0, "Programming"));
        books.add(new Book("Clean Code", 2015, 550.0, "Software"));
        books.add(new Book("Atomic Habits", 2019, 399.0, "Self Help"));
        books.add(new Book("DSA in Java", 2022, 700.0, "Programming"));

        // Filtering :- Book cheaper than 500
        System.out.println("-----------------Filtering :- Book cheaper than 500--------------------");
        Stream<Book> FilteringBook = books.stream()
                .filter(predicate);
        FilteringBook.forEach(System.out::println);

        // Maping :- Convert book tittle to uppercase;
        System.out.println("------------------Convert book tittle to uppercase-------------------");
        Stream<String> upperCasetittle = books.stream()
                .map(book -> book.Tittle.toUpperCase());
        upperCasetittle.forEach(System.out::println);

        // sorting :- Book by Publication date;
        System.out.println("---------------sorting :- Book by Publication date----------------");
        Stream<Book> SortedBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.PublicationYear));
        SortedBooks.forEach(System.out::println);

        // Distinct :- Remove duplication tittle
        Stream<Book> uniqueBook = books.stream()
                .distinct();
        uniqueBook.forEach(System.out::println);

        // Limit :- Display only the first 3 books;
        System.out.println("Display first 3 book by publication Year :- ");
        Stream<Book> LimitBook = books.stream()
                .sorted(Comparator.comparingInt(book -> book.PublicationYear))
                .limit(3);
        LimitBook.forEach(System.out::println);

        // skip :- skip the first 2 books
        Stream<Book> AfterSkippinTwo = books.stream()
                .skip(2);
        AfterSkippinTwo.forEach(System.out::println);
    }

    static Predicate<Book> predicate = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price < 500 ;
        }
    };
}
