package Lab_1;
// Write a program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

public class Lab_1_1_NameRoll {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your roll: ");
        int roll = s.nextInt();

        System.out.print("Enter your section: ");
        String section = s.next();

        System.out.print("Enter your branch: ");
        String branch = s.next();

        System.out.println("\n\n");

        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);

        s.close();
    }

}
