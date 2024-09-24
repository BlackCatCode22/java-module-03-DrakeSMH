// Drake Parker
// ArrayListPractice.java

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println("\n Welcome to ArrayList Practice!\n");

        // Create an ArrayList of Strings
        ArrayList<String> myListOfString = new ArrayList<>();

        // Add a few elements to my Array List.
        myListOfString.add("first");
        myListOfString.add("second");
        myListOfString.add("third");

        // Output our ArrayList
        System.out.println("\nmyListOfStrings is: " + myListOfString);

        // Remove an element.
        myListOfString.remove(0);

        // Output our ArrayList
        System.out.println("\nAfter Removing...");
        System.out.println("\nmyListOfStrings is: " + myListOfString);

        // Remove an element.
        myListOfString.remove("third");

        // Output our ArrayList
        System.out.println("\nAfter Removing...");
        System.out.println("\nmyListOfString is: " + myListOfString);

        // Use a for loop to add some things to our list
        String toAdd = "";

        for (int i=0; i<1000; i++) {
            toAdd = toAdd + " adding... " + Integer.toString(i);
            myListOfString.add(toAdd);
        }

        // Output our ArrayList
        System.out.println("\nAfter adding a bunch of stuff...");
        System.out.println("\nmyListOfString is: " + myListOfString);

        // Use a for loop to output each element of our ArrayList
        for (int i = 0; i < myListOfString.size(); i++) {
            System.out.println("An element in my list is: " + myListOfString.get(i));
        }



    }
}
