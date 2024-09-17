// Drake Parker 9/17/24
// MainClassPractice.java

public class MainClassPractice {
    public static void main(String[] args) {

        System.out.printf("\nWelcome to my OOP Class Practice Program!");

        // Create a couple Dog objects
        // with an empty arguments (
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        // Create a dog with a String name.
        Dog aDog = new Dog("tyrone");
                System.out.println("\n The new dog's name is: " + aDog.getName());

        // Output the new Dog object's name.
        System.out.println("\n The new dog's name is: " + aDog.getName());

        // Create a Fourth dog with an int age.
        Dog fourthDog = new Dog(22);

        // Output the dog's age.
        System.out.println("\nMy new dog's age is: " + fourthDog.getAge());

        // And... finally create a fifth and last dog...
        Dog fifthDog = new Dog("my new dog's name", 7);

        // Validate it.
        System.out.println("\nMy dog, who is named: " + fifthDog.getName() +" had a birthday and age is now: " + fifthDog.getAge());
    // Give our dog a birthday (add a year to it's age)
    fifthDog.setAge(fifthDog.getAge() + 1);
    }
}