// 5. Aim of the program: Write a program which will overload the area () method and
// display the area of a circle, triangle and square as per user choice and user
// entered dimensions.
// Input: Mention dimensions like radius, base, height, side
// Output: Display area of circle
// Display area of triangle
// Display area of square

import java.util.Scanner;

public class Area {
    public void area(double rad) {
        double area = 3.1415 * rad * rad;
        System.out.println("Area of Circle: " + area);
    }

    public void area(double b, double h) {
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }

    public void area(int side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Area ar = new Area();

        System.out.println("Do you want the area of\n[1] Circle\n[2] Triangle\n[3] Square");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius: ");
                double rad = s.nextDouble();
                ar.area(rad);

                break;
            case 2:
                System.out.print("Enter the base: ");
                double b = s.nextDouble();
                System.out.print("Enter the height: ");
                double h = s.nextDouble();

                ar.area(b, h);

                break;
            case 3:
                System.out.print("Enter the side: ");
                int side = s.nextInt();
                ar.area(side);
                break;

            default:
                break;
        }
    }
}
