package MyAnimals;

public class Animal {
    // There ins not a "static" keyword here, so... this method
    // will be avaliable to Animal objects.
    // Create a static member named numOfAnimals
    public static int numOfAnimals = 0;

    // Create a constructor
    public Animal() {
        numOfAnimals++;
    }

    public void animalSound() {
        System.out.println("\n A sound from the animal class.");
    }
}
