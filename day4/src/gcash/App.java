package gcash;
import java.util.HashMap ;
import java.util.Map ;

public class App {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();

        users.put("09952996125", "Ian");
        users.put("09520225465", "Hatdog");
        users.put("09175226523", "Jumbo");

        System.out.println(users.get("09952996125")); // Ian
        System.out.println(users.get("09520225465")); // Hatdog
        System.out.println(users.get("09175226523")); // Jumbo
        System.out.println(users.get("09526523365")); // null
    }
}
