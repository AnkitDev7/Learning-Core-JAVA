package Exception_Handling;

class Library{
    int avilableBooks = 3;

    public void borrowBook(int BookRequsted){
        try {
            int[] book = {101,102,103};
            System.out.println("Book Requsted :- " +book[BookRequsted]);
        }catch (Exception e){
            System.out.println("Exception Occured , You requested a book that does not exist.");
        }finally {
            System.out.println("Finally Block ");
        }
    }
}
public class LibrarayDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(8);
    }
}
