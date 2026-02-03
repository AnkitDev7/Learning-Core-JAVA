package Project.UserProject;

import java.util.*;

public class UserManagement {
    public static void main(String[] args) {
//        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN","USER"));
//        Users user1 = new Users("Ankit Kumar Dubey" ,true, user1Roles);
//        List<Users>user = new ArrayList<>();
//        user.add(user1);

        // Kam line me karne ke liye
        List<Users> user = new ArrayList<>();
        user.add(new Users("Ankit Kumar Dubey" ,true,
                new HashSet<>(Arrays.asList("ADMIN","USER")))
        );

        user.add(new Users("Amit" ,false,
                new HashSet<>(Arrays.asList("USER")))
        );

        user.add(new Users(" Dubey ji" ,true,
                new HashSet<>(Arrays.asList("MANAGER")))
        );


        // Remove in Active User
        Iterator<Users> iterator = user.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().isActive()){
                iterator.remove();
            }
        }

        // PRINT ACTIVE USERS
        System.out.println("ACTIVE USERS :- ");
        for (Users user1 : user){
            System.out.println(user1.getName());
        }

        // COUNT USERS PER ROLE
        Map<String , Integer> roleCount = new HashMap<>();
        for (Users  user2 : user){
            for (String role :user2.getRoles()){
                roleCount.put(role,roleCount.getOrDefault(role,0)+1);
            }
        }

        System.out.println("All users :- ");
        for (Map.Entry<String,Integer>entry :roleCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
