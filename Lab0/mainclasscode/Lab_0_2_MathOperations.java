package Lab0.mainclasscode;

public class Lab_0_2_MathOperations {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = "  + (a - b));
        System.out.println("a * b = " + (a * b));

        // Exception handling
        try {
            System.out.println("a / b = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


        System.out.println("a % b = " + (a % b));

    }
}
