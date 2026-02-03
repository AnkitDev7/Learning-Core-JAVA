package Collection_One.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer , String> userMap = new HashMap<>();
        userMap.put(1,"Ankit");
        userMap.put(2,"Anand Mishra");
        userMap.put(3, "Vishwajit Tiwari");

        System.out.println("User with id 2 :- " + userMap.get(1));

        // sirf value lena ho tab
        for (String name : userMap.values()) {
            System.out.println(name);
        }

        // jab value and address dono lena ho tab
        System.out.println("All Users Iterate :- ");
        for (Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
