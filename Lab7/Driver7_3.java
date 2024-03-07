package Lab7;

// Define  an  interface  with  three  methods  –  
//     earnings(),  
//     deductions() 
// and  bonus()  

// and  define  a  Java  class  ‘Manager’  which  uses  this  interface  without 
// implementing bonus() method. 

// Also define another Java class ‘Substaff’ which 
// extends from ‘Manager’ class 
// and implements bonus() method.  

// Write the complete program to 
// find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by 
// the user as per the following guidelines 

import java.util.Scanner;

interface Payable {
    double earnings();

    double deductions();

    double bonus();
}

abstract class Manager_ implements Payable {
    protected double basicSalary;

    public Manager_(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        double da = basicSalary * 0.8;
        double hra = basicSalary * 0.15;
        return basicSalary + da + hra;
    }

    public double deductions() {
        return basicSalary * 0.12;
    }

    // Not implementing bonus()
}

class Substaff extends Manager_ {
    public Substaff(double basicSalary) {
        super(basicSalary);
    }

    public double bonus() {
        return basicSalary * 0.5;
    }
}

public class Driver7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the basic salary of the substaff:");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff(basicSalary);
        System.out.println("Earnings: " + substaff.earnings());
        System.out.println("Deductions: " + substaff.deductions());
        System.out.println("Bonus: " + substaff.bonus());
    }
}
