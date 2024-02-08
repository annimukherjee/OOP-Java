// 3. Aim of the program: Write a program in java to input and display the details of n
// number of students having roll, name and cgpa as data members. Also display the
// name of the student having lowest cgpa.
// Input: Enter Roll No, Name and cgpa of 'n' number of students.
// Output: Display the details of 'n' number of students. Also display the
// name of student with lowest cgpa

import java.util.Scanner;

public class Student {

    int roll;
    String name;
    double cgpa;

    // Student(int roll, String name, double cgpa)
    // {
    // this.roll = roll;
    // this.name = name;
    // this.cgpa = cgpa;
    // }

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.print("Roll: " + roll + "\t");
        System.out.print("Name: " + name + "\t");
        System.out.print("CGPA: " + cgpa + "\t");

        System.out.println();
    }

}
