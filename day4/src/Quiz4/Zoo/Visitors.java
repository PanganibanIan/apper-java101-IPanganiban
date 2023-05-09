package Quiz4.Zoo;

import Quiz4.Zoo.Personnel.Employees;

public class Visitors {
    String name;
    private int age;

    public int getAge() {return age ;}

    public void displayVisitor() {
        Visitors echo = new Visitors();
        echo.name = "Jericho Rosales";
        this.age = 35;

        System.out.println("Visitor: " + echo.name);
    }
    public static void main(String[] args) {
        //ERROR! Employee details should only be accessible from Employee class and Manager Class
//        Employees Jobert = new Employees() ;
//        System.out.println("------------------------------------------------");
//        System.out.println("Employee:");
//        Jobert.displayEmployee();
    }
}
