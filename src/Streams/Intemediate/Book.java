package Streams.Intemediate;

public class Book {
    String Tittle;
    int PublicationYear;
    double price;
    String categery;

  public Book(String Tittle,int PublicationYear,double price, String categery){
        this.Tittle = Tittle;
        this.PublicationYear = PublicationYear;
        this.price = price;
        this.categery = categery;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Tittle='" + Tittle + '\'' +
                ", PublicationYear=" + PublicationYear +
                ", price=" + price +
                ", categery='" + categery + '\'' +
                '}';
    }

    public String getCategory() {
      return categery;
    }
}
