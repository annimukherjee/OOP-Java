package Lab_1;
// Write a program to print the corresponding grade for the given mark using if..else statement in Java

import java.util.Scanner;

public class Lab_1_2_GradeDisplay {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your marks out of 100: ");
        int marks = s.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("O grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("E grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("A grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("B grade");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("C grade");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("D grade");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("F grade");
        }

        s.close();

    }
}
