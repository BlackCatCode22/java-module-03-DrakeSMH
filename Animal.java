package drake.zoo.com;
import java.util.Date;

public class Animal {
    // Create a static int that keep track of the number  of animals created
    static int numOfAnimals = 0;

    // create a constructor for our new Animal class
    public Animal() {
        numOfAnimals++;
    }

    // Create a constructor that accepts a name
    public Animal(String aName) {
        this.animalName = aName;
        numOfAnimals++;
    }

    // Create a few attributes (fields)
    // Sex will be 'male' or 'female'
    private String sex = "";
    // age will be in years
    private int age = 0;
    // and weight will be in pounds
    private int weight = 0;
    // a unique ID for each animal
    private String animalID;
    // animal names come from a text file called animalNames.txt
    private String animalName;
    // animal birthdate.
    private Date animalBirthdate;
    // animal color
    private String animalColor;
    // origin zoo
    private String animalOrigin;
    // arrival date
    private Date animalArrivalDate;


    // create getters and setters

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID() {return animalID;}
    public void setAnimalID(String animalID) { this.animalID = animalID;}

    public String getAnimalName() {return animalName;}
    public void setAnimalName(String animalName) { this.animalName = animalName;}

    public Date getAnimalBirthdate() {return animalBirthdate;}
    public void getAnimalBirthdate(Date animalBirthdate) {this.animalBirthdate = animalBirthdate;}

    public String getAnimalColor() {return animalColor;}
    public void setAnimalColor(String animalColor) {this.animalColor = animalColor;}

    public String getAnimalOrigin() {return animalOrigin;}
    public void setAnimalOrigin(String animalOrigin) {this.animalOrigin = animalOrigin;}

    public Date getAnimalArrivalDate() {return animalArrivalDate;}
    public void setAnimalArrivalDate() {this.animalArrivalDate = animalArrivalDate;}




}