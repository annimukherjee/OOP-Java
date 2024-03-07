package UploadCode;

import java.util.Scanner;

public class Lab_7_3_MultipleTryCatch {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number to divide by: ");
            int d = sc.nextInt();

            int res = 15 / d; // will throw ArithmeticException
            System.out.println("This will never print... " + res);
            sc.close();

            int[] arr = { 1, 2, 3, 4 };

            arr[50] = 10; // will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception!!!: " + e);
        }

    }

}