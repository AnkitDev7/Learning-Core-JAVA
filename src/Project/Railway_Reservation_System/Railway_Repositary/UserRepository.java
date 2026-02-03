package Project.Railway_Reservation_System.Railway_Repositary;

import Project.Railway_Reservation_System.RailwayAll_Domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String , User> Usermap = new HashMap<>();

    public static void save(User user) {
        Usermap.put(user.getUserName(),user);
    }

    public static User findByUsername(String username) {
        return Usermap.get(username);
    }

    public static User findByPassword(String password){
        return Usermap.get(password);
    }
}
