package Lab2;

// Program  to  find  no.  of  objects  created  out  of  a  class  using 
// ‘static’ modifier.

import java.util.Scanner;

public class Lab_2_4_ObjectCounter {
    // This static variable will hold the number of objects created.
    private static int objectCount = 0;

    // Constructor to initialize the object
    public Lab_2_4_ObjectCounter() {
        // Increment the static counter variable each time an object is created
        objectCount++;
    }

    // Method to display the number of objects created
    public static void displayObjectCount() {
        System.out.println("No of objects created: " + objectCount);
    }

    // Main method to create objects and display the number of objects created
    public static void main(String[] args) {
        // Create three objects
        Lab_2_4_ObjectCounter obj1 = new Lab_2_4_ObjectCounter();
        Lab_2_4_ObjectCounter obj2 = new Lab_2_4_ObjectCounter();
        Lab_2_4_ObjectCounter obj3 = new Lab_2_4_ObjectCounter();

        // Display the number of objects created
        Lab_2_4_ObjectCounter.displayObjectCount();
    }
}