package Quiz4.Zoo.Personnel;

import Quiz4.Zoo.Animal ;
import Quiz4.Zoo.Visitors ;

public class Employees {
    String name;
    double salary;
    String assignedAnimal ;

    void displayEmployee() {
        Employees Jobert = new Employees() ;

        Jobert.name = "Kuya Jobert";
        Jobert.salary = 100000;
        Jobert.assignedAnimal = "Dogs" ;

        System.out.println("Employee Name: " + Jobert.name);
        System.out.println("Employee Salary: " + Jobert.salary);
        System.out.println("Employee Assigned Animal: " + Jobert.assignedAnimal);
    }

    public static void main(String[] args) {
        //just to show that Employee class has access to Animals, Visitors, and Employee class
        Animal coco = new Animal() ;
        Employees Jobert = new Employees() ;
        Visitors Jericho = new Visitors() ;

        System.out.println("Visotors:");
        Jericho.displayVisitor() ;
        System.out.println("Age: " + Jericho.getAge());

        System.out.println("------------------------------------------------");
        System.out.println("Animal:");
        coco.displayAnimal();

        System.out.println("------------------------------------------------");
        System.out.println("Employee:");
        Jobert.displayEmployee();
    }
}
