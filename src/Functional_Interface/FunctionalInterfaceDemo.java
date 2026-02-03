package Functional_Interface;


@FunctionalInterface
//    Functional Interface ka matlab hota hai ki ek hi abstract method hona chahiya class me ;
interface BookAction{
    void perform();
}


// Functional Interface with Parameters
@FunctionalInterface
interface Operation{
    int add(int a , int b);
}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
 /*
        Original Syntax :-
        BookAction action = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action Perform :- ");
            }

        };
        action.perform();


          Lembda Expression :- Lambda Expression ka kaam hota hai.
          👉 functional interface ke method ka implementation short & clean tarike se dena.
          👉 bina extra class banaye.
          Syntax :- (parameters) -> { body }
*/
        // Step :- 2
        BookAction action = () -> {
            System.out.println("Action Performed...");
        };
        action.perform();

        // Step :- 3
        BookAction action1 = () -> System.out.println("Action Performed sucessfully :- ");
        action1.perform();


        //  Functional InterFaces With Parameter
        Operation Sumadd = (int a , int b) -> {
            int sum = a + b;
            return sum;
        };
        System.out.println(Sumadd.add(5,12));

        // Thread Interfaces
        new Thread(() -> System.out.println("New thread created")).start();
    }
}
