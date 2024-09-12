// Drake Parker 9/12/24
// Main.Java
import MyAnimals.Animal;
import MyAnimals.Cat;
import MyAnimals.Dog;
import MyStudent.Student;
import MyStudent.App;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Hello from the Main \n");

        // Create a Student object.
        Student student = new Student();

        // Create an object from a runnable class
        App app = new App();

        // Use a method from the Student class.
        // I know that I have a static method in the Student class
        // and I know how to call a static class method
        Student.sayHello();

        // Out the number of animals before any are created.
        System.out.println("\n The number of animals before any are created is " + Animal.numOfAnimals);


        // Createe a Cat object.
        Cat cat = new Cat();
        // use a method that is avaliable to the Cat object named cat.
        System.out.println("\n this sound is coming from the Cat object named cat");
        cat.animalSound();

        // Create a Dog object
        Dog dog = new Dog();
        // Use a method that is avaliable to the Dog object named dog.
        System.out.println("\n this sound is coming from the Dog object named cat");
        dog.animalSound();

        // Out the number of animals after a few Animal objects were created.
        System.out.println("\n The number of animals after a few were created is " + Animal.numOfAnimals);

    }
}
