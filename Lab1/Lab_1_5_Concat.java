package Lab1;

// Write a program in Java to take first name and last name from 
// user and  print both in one line as last name followed by first name

import java.util.Scanner;

public class Lab_1_5_Concat {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = s.next();

        System.out.print("Enter s2: ");
        String s2 = s.next();

        System.out.println("s1 + s2 = ");
        System.out.println(s2 + " " + s1);

    }
}
