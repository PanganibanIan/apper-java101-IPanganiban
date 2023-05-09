package ZooDiscussion;

import ZooDiscussion.person.Manager;

public class ZooApp {
    public static void main(String[] args) {
        Manager manager1 = new Manager( "Manager 1" );
        manager1.setName("Orvyl");
        manager1.setAge(12);

        System.out.println(manager1.getName());

    }
}
