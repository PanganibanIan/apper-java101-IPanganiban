package Quiz4.Zoo;

public class Animal {
    public String name;
    String type;
    String food;
    String sound;
    boolean canChew;

    public Visitors displayAnimal() {
        Animal dog = new Animal();
        dog.name = "Coco the Chunky Bully";
        dog.type = "American Bulldog" ;
        dog.food = "Dog Food";
        dog.sound = "Arf Arf";
        dog.canChew = true ;

        System.out.println("Name: " + dog.name);
        System.out.println("Type: " + dog.type);
        System.out.println("Food: " + dog.food);
        System.out.println("Sound: " + dog.sound);
        System.out.println("Can chew food: " + dog.canChew);
        return null;
    }

    public static void main(String[] args) {
        Animal coco = new Animal();
        coco.displayAnimal() ;
    }
}
