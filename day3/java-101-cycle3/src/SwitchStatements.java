public class SwitchStatements {

    public static void main(String[] args) {
        Animal animal = Animal.CAT ;

        if (animal.equals("dog")){
            System.out.println("arf arf");
        } else if (animal.equals("cat")){
            System.out.println("meow meow");
        } else if (animal.equals("cow")){
            System.out.println("moo");
        } else {
            System.out.println("Roar");
        }
        System.out.println("________________________________________________________");

        switch (animal) {
            case DOG: System.out.println("arf arf");
            case CAT: System.out.println("meow meow");
            case COW: System.out.println("moo");
            case LION: System.out.println("Roar"); break;
            default:
                System.out.println("Yehey!");
        }




    }
    public enum Animal {
        DOG, CAT, COW, LION
    }

}
