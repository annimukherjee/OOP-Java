package Lab8_Exception_Upload;

import java.util.Scanner;

// Write a Java class which has a method called 
// ProcessInput().  This  method  checks  the  number  entered  by  the  user.  If  the 
// entered number is negative then throw an user defined exception called 
// NegativeNumberException,  otherwise  it  displays  the  double  value  of  the  entered 
// number.

class NegativeNumberException extends Exception {
    int x;

    NegativeNumberException(int x) {
        this.x = x;
    }

    public String toString() {
        return "The Number is negative check: " + x;
    }
}

class Test {
    void processInputs() {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        try {
            if (x < 0) {
                throw new NegativeNumberException(x);
            } else {
                System.out.println("No Exception\n" + (2 * x)); // double the value
            }
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
    }
}

public class Lab_7_7_Lab03 {
    public static void main(String[] args) {
        Test t = new Test();
        t.processInputs();
    }
}