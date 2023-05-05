package oop.app;

import oop.app.blueprint.Person;

public class App {
    public static void main(String[] args) {
        Person ian = new Person();
        ian.age = 19;
        ian.name = "Ian Panganiban" ;
        ian.isMale = true;
        ian.relationshipStatus = "Single" ;

        System.out.println(ian.getNameWithPrefix());
    }

}
