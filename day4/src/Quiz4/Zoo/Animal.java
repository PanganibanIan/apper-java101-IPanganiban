package Quiz4.Zoo;

public class Animal {
    public String name;
    String type;
    String food;

    public Visitors displayAnimal() {
        Animal dog = new Animal();
        dog.name = "Coco the Chunky Bully";
        dog.type = "American Bulldog" ;
        dog.food = "Dog Food";

        System.out.println("Name: " + dog.name);
        System.out.println("Type: " + dog.type);
        System.out.println("Food: " + dog.food);
        return null;
    }

    public static void main(String[] args) {
        Animal coco = new Animal();
        coco.displayAnimal() ;
    }
}
