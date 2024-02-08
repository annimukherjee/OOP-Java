// Aim of the program : Write a program in java using constructor overloading
// concept to calculate the area of a rectangle having data member as length and
// breadth. Use default constructor to initialize the value of the data member to zero
// and parameterized constructor to initialize the value of data member according to
// the user input.
// Input: Mention the value of length and breadth
// Output: Display the area of rectangle accordingly.

import java.util.Scanner;

public class Area_Constructor {
    double length, breadth;

    Area_Constructor() {
        length = 0;
        breadth = 0;
    }

    Area_Constructor(double a, double b) {
        length = a;
        breadth = b;
    }

    public void area() {
        System.out.println("Area is: " + length * breadth);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length and breadth");
        Area_Constructor a = new Area_Constructor(s.nextDouble(), s.nextDouble());

        a.area();

    }
}
