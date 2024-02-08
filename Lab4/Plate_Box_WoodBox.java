

package Lab4;
// 2. Aim of the program: Illustrate the execution of constructors in multi-level inheritance
// with three Java classes - plate(length, width), boxlength, width, height), wood box (length,
// width, height, thick) where box inherits from plate and woodbox inherits from box class.
// Each class has constructor where dimensions are taken from user.
// Input: Enter the dimensions
// Output: Display the dimensions accordingly

import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int l, int w) {
        width = w;
        length = l;
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
    }
}

class Plate_Box_WoodBox {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Multi-Level Constructor");

        System.out.println("Enter the length of the Plate");
        System.out.println("Enter the width of the Plate");
        Plate p = new Plate(sc.nextInt(), sc.nextInt());

        System.out.println("Length of Plate: " + p.length);
        System.out.println("Width of Plate: " + p.width);

        System.out.println("Enter the length of the Box");
        System.out.println("Enter the width of the Box");
        System.out.println("Enter the height of the Box");

        Box b = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Length of Box: " + b.length);
        System.out.println("Width of Box: " + b.width);
        System.out.println("Height of Box: " + b.height);

        System.out.println("Enter the length of the WoodBox");
        System.out.println("Enter the width of the WoodBox");
        System.out.println("Enter the height of the WoodBox");
        System.out.println("Enter the thickness of the WoodBox");

        WoodBox w = new WoodBox(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Length of WoodBox: " + w.length);
        System.out.println("Width of WoodBox: " + w.width);
        System.out.println("Height of WoodBox: " + w.height);
        System.out.println("Thick of WoodBox: " + w.thick);

    }

}