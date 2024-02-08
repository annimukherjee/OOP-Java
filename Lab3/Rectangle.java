// 2. Aim of the program : Write a program in Java to create a class Rectangle having data
// members length and breadth and three methods called read, calculate and display to read
// the values of length and breadth, calculate the area and perimeter of the rectangle and display
// the result respectively.
// Input: Mention length and breadth
// Output: Display Area of Rectangle and Perimeter of rectangle.

import java.util.Scanner;

public class Rectangle {

    double length, width;

    // Rectangle(double length, double width) {
    //     this.length = length;
    //     this.width = width;
    // }


    public void calculate(double l, double w)
    {
        double area = l*w;
        double perimeter = 2*(l+w);
        
        display(area, perimeter);
    }

    public void display(double area, double perimeter) {

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }

    public void read() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l = s.nextDouble();
        System.out.print("Enter the width: ");
        double w = s.nextDouble();
        calculate(l, w);
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.read();
    }
}
