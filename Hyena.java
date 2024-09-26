package drake.zoo.com;

public class Hyena extends drake.zoo.com.Animal {
    // Create a static int that keep track of the number  of hyenas created
    static int numOfHyenas = 0;

    // Create a constructor
    public Hyena(String someName ) {
        super(someName);
        numOfHyenas++;
    }
}