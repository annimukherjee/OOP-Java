package Lab8_Exceptions;

import java.util.Scanner;

class WithTryCatch {

    public static void main(String[] args) {

        int a = 10;
        int d;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the denominator: ");

        try {
            d = s.nextInt();
            int c = a / d;

            System.out.println("Hello this is after division\nc: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            System.out.println("You cannot divide by ZERO!");
        }

        s.close();

    }

}
