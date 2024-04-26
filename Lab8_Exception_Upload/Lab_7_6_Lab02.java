package Lab8_Exception_Upload;

// Write  a  Java  program  to  handle  an  ArithmeticException 
// using try, catch, and finally block.

public class Lab_7_6_Lab02 {
    public static void main(String[] args) {

        try {
            int d = 0;

            int res = 150 / d; // Generates Exception

            System.out.println("This will never execute");

        } catch (ArithmeticException e) {
            System.out.println("Exception!!: Division by 0\n");
        } finally {
            System.out.println("In finally block\tException has been handled");

        }

    }

}