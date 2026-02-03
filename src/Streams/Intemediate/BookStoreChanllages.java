package Streams.Intemediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BookStoreChanllages {
    public static void main(String[] args) {
               /*
        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $20. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.
         */

        List<Book> books = Arrays.asList(
                new Book("Fiction", 2018,15.99 , "The Silent Garden"),
                new Book("Science", 2020, 22.50, "Cosmic Wonders"),
                new Book("Fiction", 2005,  12.75, "Echoes in the Rain"),
                new Book("Biography",2022 ,  18.00, "A Life in Code"),
                new Book("Technology",2023 ,  35.90, "Java Stream Mastery"),
                new Book("Fiction", 2018,  14.50, "The Midnight Library"),
                new Book("Science", 2015,  25.99, "Quantum Realm"),
                new Book("Technology",2023 ,  40.00, "Advanced Spring Boot"),
                new Book("Biography", 2019,  16.99, "The Innovator's Journey"),
                new Book("Fiction",1998 ,  9.99, "Old Man and the Sea")
        );

        Stream<Book> DiscountBook = books.stream()
                .filter(book -> book.price < 20);
        DiscountBook.forEach(System.out::println);
    }
}
