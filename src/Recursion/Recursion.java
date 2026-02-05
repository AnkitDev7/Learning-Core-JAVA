package Recursion;

public class Recursion {
    // Jo method apne aap ko hi call kare usko bolte hai Recursion;
    // Recursion Stack me Store karta hai;
   public static void main() {
       System.out.println(factorial(5));
       System.out.println(sumOfNNaturalNumbers(20));
    }
    public static int factorial(int n){
       if (n == 1){
           return  1;
       }
       return n * factorial(n - 1);
    }

    public static int sumOfNNaturalNumbers(int n ){
       if (n == 1){
           return 1;
       }
       return n + sumOfNNaturalNumbers(n + 1);
    }
}
