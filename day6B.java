class Animal{
    String name;
    String species;

    public Animal(String name,String species);
    this.name=name;
    this.species=species;
}
class Dog extends Animal {
    String breed;

    public Dog(String name,String species) {
        super(name,species);
        this.breed=breed;
    }

}
public class Day6B{
    public static void main(String[] args) {
        Dog dog = new Dog("Siberian Husky","canis lupus","Siberia");

        dog.name();
        dog.species();
        dog.breed();

    }
}