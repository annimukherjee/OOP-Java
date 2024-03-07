package Lab5;

import java.util.Scanner;

// 1. Aim of the program -Illustrate the usage of abstract class with following Java
// classes-
// • An abstract class 'student' with two data members roll no, reg no, a method getinput) and
// an abstract method course()
// • A subclass 'kiitian' with course) method implementation
// Write the driver class to print the all details of a kiitian object.

abstract class Abs_Student {

    int roll_no;
    int reg_no;

    Scanner s = new Scanner(System.in);

    public void getinput() {
        System.out.println("Enter the roll no");
        roll_no = s.nextInt();
        System.out.println("Enter the reg no");
        reg_no = s.nextInt();

    }

    abstract void course();
}

class kiitian extends Abs_Student {

    String coursename;
    Scanner s = new Scanner(System.in);

    kiitian(String course) {
        this.getinput();
        coursename = course;
    }

    @Override
    void course() {
        System.out.println("Roll Num: " + roll_no);
        System.out.println("Registration Num: " + reg_no);
        System.out.println("Course: " + coursename);
    }
}

class Driver_kiit
{
    public static void main(String[] args) {
        kiitian stud_22055 = new kiitian("B. Tech");
        stud_22055.course();
    }
}