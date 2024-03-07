package Lab8;

import java.util.Scanner;

class MultipleCatch {

    public static void main(String[] args) {

        int a = 10;
        int d;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the denominator: ");

        try {
            d = s.nextInt();

            int arr[] = { 10, 20, 30 };

            arr[90] = -99; // ArrayIndexOutOfBounds Exception

            System.out.println("This is never printed");

            int c = a / d; // ArithmeticException

            System.out.println("Hello this is after all exceptions");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            System.out.println("You cannot divide by ZERO!");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("You cannot exceed ArrayBounds!!");
        }

        s.close();

    }

}
