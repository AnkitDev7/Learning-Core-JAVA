package Inbuilt.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
/*      Predicate :- ye ek boolean value function hai jo kisi condition ko test karne ke use kiya jata hai.
        ek argument accept karega aur boolean value return kar dega.
 */
        Predicate<Integer> isEven = n -> n % 2 == 0 ;
        System.out.println(isEven.test(10));

        // BiPredicate :- BiPredicate predicate jaisa hi kam karta hai bas 2 argument leta hai;
        BiPredicate<Integer,Integer> isSumEven = (a,b) -> (a +b ) % 2 == 0 ;
        System.out.println(isSumEven.test(10,20));
    }
}
