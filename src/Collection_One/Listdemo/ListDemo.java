package Collection_One.Listdemo;

import java.util.ArrayList;
import java.util.List;

class car{
    String brand;

    car(String brand){
        this.brand = brand;
    }
}

public class ListDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Ankit");
        users.add("Dubey ji");
        users.add("Age:- 19");
        users.add("Amit Kumar");

        System.out.println("All Users :- ");
        for (String user : users){
            System.out.println(user);
        }

        System.out.println("Element using index :- " + users.get(0));


        // List of Object
        car car1 = new car("Toyota");
        car car2 = new car("Ford");
        List<car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println("====   All Car:-  ===");
        for (car Car : carList){
            System.out.println(Car.brand);
        }

    }
}
