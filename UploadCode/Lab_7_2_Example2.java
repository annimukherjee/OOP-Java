package UploadCode;

// Using try and catch

public class Lab_7_2_Example2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int res = 45 / d; // This will return EXCEPTION!!
            System.out.println("Hello\nd is: " + d);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);

        }
        System.out.println("After try catch block");
    }

}