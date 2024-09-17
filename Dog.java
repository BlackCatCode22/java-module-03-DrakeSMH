public class Dog {
    // Create two fields for our Dog objects.

    private String name;
    private int age;

    // Create getters and setters for our fields.

    // Create getter and setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Create a getter and setter for age.
    public int getAge() {
        return this.age;
        // this would work as well because there is no ambiquity.
        // return age;

    }
    public void setAge(int age){
        this.age = age;
    }




    // Create a constructor for the Dog objects that will be created with the "new" keyboard.
    // A constructor is a special method that is called ir invoked when... the Dog class is used
    // to create an object.
    public Dog() {
        System.out.println("\na dog object was created. This message is from the constructor. \n");

    }


    // Create a constructor that accepts a String data type for the Dog's name.
    public Dog(String myName){
       this.name = myName;
    }

    // Create a constructor that accepts an argument when n object is created, the argument
    // will be an int.
    public Dog(int theAge){
    this.age = theAge;

    }

    // Create a constructor that accepts two arguments - a string for the name, and an int for age.
    public Dog(String someName, int someAge){
        // Assign name and age to our new object.
        this.age = someAge;
        this.name = someName;
    }

}
