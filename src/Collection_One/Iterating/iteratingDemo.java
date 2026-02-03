package Collection_One.Iterating;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratingDemo {

    // RESET
    static final String RESET = "\u001B[0m";

    // TEXT COLORS
    static final String BLACK = "\u001B[30m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String CYAN = "\u001B[36m";

    // BACKGROUND COLORS
    static final String BG_RED = "\u001B[41m";
    static final String BG_GREEN = "\u001B[42m";
    static final String BG_BLUE = "\u001B[44m";

    public static void main(String[] args) {

        List<String> user = new ArrayList<>();
        user.add("Ankit Dubey");
        user.add("Aman Kumar");
        user.add("Khushi Kumari");
        user.add("Nidhi Upadhaya");
        user.add("Anand Mishra");

        // FOR EACH LOOP
        System.out.println(CYAN + "---------------------------------" + RESET);
        System.out.println(BG_BLUE + BLACK + " USING FOR EACH LOOP " + RESET);
        for (String users : user) {
            System.out.println(GREEN + "✔ " + users + RESET);
        }

        // FOR LOOP
        System.out.println(CYAN + "---------------------------------" + RESET);
        System.out.println(BG_GREEN + BLACK + " USING FOR LOOP " + RESET);
        for (int i = 0; i < user.size(); i++) {
            System.out.println(YELLOW + "➤ " + user.get(i) + RESET);
        }

        // ITERATOR
        System.out.println(CYAN + "---------------------------------" + RESET);
        System.out.println(BG_RED + BLACK + " USING ITERATOR " + RESET);
        Iterator<String> it = user.iterator();
        while (it.hasNext()) {
//            System.out.println(CYAN + "→ " + it.next() + RESET);
            if (it.next().equals("Anand Mishra")){
                it.remove();
            }
        }
        for (String users : user) {
            System.out.println(GREEN + "✔ " + users + RESET);
        }

        // END
        System.out.println(CYAN + "---------------------------------" + RESET);
    }
}
