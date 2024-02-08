package Lab1;

// Write a program to print the week day for the given day no. of 
// the  current month using switch case statement

import java.util.Scanner;

public class Lab_1_3_WeekDay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the day of the month...");
        int day = s.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5, 6, 7:
                System.out.println("Week 1");
                break;

            case 8, 9, 10, 11, 12, 13, 14:
                System.out.println("Week 2");
                break;

            case 15, 16, 17, 18, 19, 20, 21:
                System.out.println("Week 3");
                break;

            case 22, 23, 24, 25, 26, 27, 28, 29, 30:
                System.out.println("Week 4");
                break;

            default:
                break;
        }

    }
}
