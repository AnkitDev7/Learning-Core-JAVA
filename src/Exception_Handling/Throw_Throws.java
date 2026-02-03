package Exception_Handling;

// Throw Keyword
/* class Book{
    int avilableBook = 3;
    public void AllowBook(int BookRequstedCount){
        try {
            if (BookRequstedCount > avilableBook){
                throw new Exception("Not enough books available");
            }
        }catch (Exception e){
            System.out.println("Exception Occured , You requested a book that does not exist.");
        }finally {
            System.out.println("Finally Block ");
        }
    }

}
 */

// throws Keyword
class Book{
    int avilableBook = 3;
    public void AllowBook(int BookRequstedCount) throws Exception {
            if (BookRequstedCount > avilableBook) {
                throw new Exception("Not enough books available");
            }

    }

}

public class Throw_Throws {
    public static void main(String[] args) {
        Book book = new Book();
        try {
            book.AllowBook(9);
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}
