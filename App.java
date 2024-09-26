package drake.zoo.com;

// Drake Parker 9/26/24
// App.java
// Driver file for the zoo midterm program.


public class App {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my Zoo Program!\n");

    drake.zoo.com.Animal myAnimal = new drake.zoo.com.Animal();
    myAnimal.setAnimalName("my first animal");
    System.out.println("\nThe name of my first animal is: " + myAnimal.getAnimalName());

    drake.zoo.com.Animal anotherAnimal = new drake.zoo.com.Animal("Billy");
    System.out.println("\nThe name of the second animal is: " + anotherAnimal.getAnimalName());

    System.out.println("\nNumber of animals is: " + drake.zoo.com.Animal.numOfAnimals);

    // Create a Hyena with a name
        drake.zoo.com.Hyena aNewHyena = new drake.zoo.com.Hyena("Jiblits");

        System.out.println(" THe new hyena's name is: " + aNewHyena.getAnimalName());



    }
}