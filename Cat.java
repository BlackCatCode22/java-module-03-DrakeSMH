package MyAnimals;

public class Cat extends Animal {
    // the Cat class is a subclass of Animal.
    // so it should have all the methods from the Animal class
    // avaliable to it.
    // This is polymorphism - this word means "many shapes"
    // when used here, by a Cat object, this method that has the same name
    // as the method in the superclass, take another shape
    public void animalSound() {
        System.out.println("\n A sound from the Cat class used by a Cat object - 'meow'");
    }

}
