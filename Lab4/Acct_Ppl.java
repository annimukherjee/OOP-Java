// 4. Aim of the program :Write a class Account containing acc_no, balance as data

// members and two methods as input) for taking input from user and disp) method to
// display the details. Create a subclass Person which has name and aadhar_no as
// extra data members and override disp) function. Write the complete progrm to take
// and print details of three persons.
// Input: Enter details of three persons.
// Output: Display details of three persons.

package Lab4;

import java.util.Scanner;

// Base class Account
class Account {
    private int acc_no;
    private double balance;

    public Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter accnt number: ");
        acc_no = sc.nextInt();
        System.out.println("Enter bal: ");
        balance = sc.nextDouble();
    }

    public void disp() {
        System.out.println("Acct num: " + acc_no);
        System.out.println("Bal: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;

    public Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter aadhar num: ");
        aadhar_no = sc.next();
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar num: " + aadhar_no);
    }
}

public class Acct_Ppl {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of person " + (i + 1) + ":");
            persons[i] = new Person(0, 0, "", "");
            persons[i].input();
        }

        System.out.println("\nDetails of persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }
    }
}