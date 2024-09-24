public class Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal objects.
    public Animal() {
        numOfAnimals++;
    }


    // Create a few attributes (fields)
    // sex will be 'male' or 'female'
    private String sex = "";
    // age will be in years.
    private int age = 0;
    // weight will be in pounds
    private int weight = 0;

    // Create getters and setters.

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
}

