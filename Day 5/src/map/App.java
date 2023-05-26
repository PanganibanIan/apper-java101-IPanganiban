package map;

import java.util.Scanner ;
import java.util.HashMap;
import java.util.Map ;

public class App {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innova") ;
        cars.put("c2", "Fortuner") ;
        cars.put("c3", "Expander") ;
        cars.put("c4", "Vios") ;
        cars.put("c5", "Civic") ;

        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.get("c4"));
        System.out.println(cars.containsKey("c3"));
        System.out.println(cars.containsValue("Fortuner"));
        System.out.println(cars.values());

        System.out.println("=================================================================================");

        Scanner scanner = new Scanner(System.in);
        String nextDouble = scanner.next();
        System.out.println(Double.valueOf(nextDouble));

    }


}
