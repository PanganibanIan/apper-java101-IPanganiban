package Quiz4.Zoo.Personnel;

import Quiz4.Zoo.Animal ;
import Quiz4.Zoo.Visitors ;

class Manager {
    String name;
    int age;
    String initialTitle ;

    void displayManager() {
        Manager Boss = new Manager();

        Boss.name = "Robert Kiyosaki";
        Boss.age = 50;
        Boss.initialTitle = "Unit Manager";

        System.out.println("Manager Name: " + Boss.name);
        System.out.println("Age: " + Boss.age);
        System.out.println("Title: " + Boss.initialTitle);
    }

    public static void main(String[] args) {
        //Manager class has access to all classes including Employee Salary
        Animal coco = new Animal() ;
        Employees Jobert = new Employees() ;
        Visitors Jericho = new Visitors() ;
        Manager boss = new Manager() ;

        System.out.println("Visotors:");
        Jericho.displayVisitor() ;
        System.out.println("Age: " + Jericho.getAge());

        System.out.println("------------------------------------------------");
        System.out.println("Animal:");
        coco.displayAnimal();

        System.out.println("------------------------------------------------");
        System.out.println("Employee:");
        Jobert.displayEmployee();

        System.out.println("------------------------------------------------");
        System.out.println("Manager:");
        boss.displayManager();

    }

}
