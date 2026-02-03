package Collection_One.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("MANAGER");
        roles.add("USER");

        for (String role : roles){
            System.out.println("ROLE :- " + role);
        }
    }
}
