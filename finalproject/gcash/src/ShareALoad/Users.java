package ShareALoad;

import java.util.HashMap ;
import java.util.Map ;

public class Users {
    static Map<String, String> users = new HashMap<>();
    static {
        users.put("09175861661", "Bob");
        users.put("09175861662", "Marley");
        users.put("09175861663", "Seth");
        users.put("09175861664", "Ryan");
        users.put("09175861665", "Fritz");
    }
    static Map<String, Double> userBal = new HashMap<>();
    static {
        userBal.put("09175861661", 100.0);
        userBal.put("09175861662", 100.0);
        userBal.put("09175861663", 100.0);
        userBal.put("09175861664", 100.0);
        userBal.put("09175861665", 100.0);
    }

    static String getUser (String user) {
        return users.get(user) ;
    }

    static Double getBal (String user) {
        return userBal.get(user);
    }

    static void addUser (String user, String name) {
        users.put(user, name);
        userBal.put(user, 100.0) ;
    }

    static void currentBalances () {
        for (String i : users.keySet()) {
            System.out.println(i + ": " + getUser(i) + " " + getBal(i));
        }
    }
    static void shareALoad (String sender, Double amt, String receiver) {
        userBal.put(sender, (getBal(sender)-amt));
        userBal.put(receiver, (getBal(receiver)+amt)) ;
    }

}