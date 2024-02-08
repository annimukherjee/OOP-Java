// 4. Aim of the program: Write a program to overload subtract method with various
// parameters in a class in Java. Write the driver class to use the different subtract
// methods using object.
// Input: Mention various subtract method having different parameters.
// Output: Subtract method will display the result accordingly

class OverloadSubtract {

    void subtract(int a, int b) {
        System.out.println("Subtraction result (int): " + (a - b));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction result (double): " + (a - b));
    }

    void subtract(String a, String b) {
        System.out.println("Subtraction result (String): " + a.replace(b, ""));
    }
}

public class Driver {
    public static void main(String[] args) {
        OverloadSubtract obj = new OverloadSubtract();

        // Using subtract(int a, int b)
        obj.subtract(10, 5);

        // Using subtract(double a, double b)
        obj.subtract(10.5, 5.5);

        // Using subtract(String a, String b)
        obj.subtract("Hello", "l");
    }
}