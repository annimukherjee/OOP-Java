package Lab4;

import java.util.Scanner;

// A  Plastic  manufacturer  sells  plastic  in  different  shapes  like  2D 
// sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per 
// cubic ft.  Implement it in Java to calculate the cost of plastic as per the dimensions given by 
// the user  where 3D inherits from 2D.

public class Box_Inherit_Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter\n[0] For Two_D\n[1] For Three_D");
        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Enter Length and Breadth");
                Two_D sheet = new Two_D(sc.nextInt(), sc.nextInt());
                System.out.println("The area of the sheet is " + sheet.area());
                System.out.println("The cost of the sheet is " + sheet.cost());
                System.out.println("=============");
                break;
            case 1:
                System.out.println("Enter Length and Breadth and Depth");
                Three_D boxx = new Three_D(sc.nextInt(), sc.nextInt(), sc.nextInt());
                System.out.println("The volume of the box is " + boxx.volume());
                System.out.println("The cost of the box is " + boxx.cost());
                System.out.println("=============");
                // System.out.println("20");
                break;
            default:
                System.out.println("Wrong Input");
        }
    }

}

class Two_D {

    int length, breadth;

    Two_D(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {

        return length * breadth;
    }

    int cost() {
        return area() * 40;
    }

}

class Three_D extends Two_D {
    int depth;

    Three_D(int l, int b, int d) {
        super(l, b);
        depth = d;
    }

    int volume() {
        return length * breadth * depth;
    }

    int cost() {
        return area() * depth * 60;
    }
}
