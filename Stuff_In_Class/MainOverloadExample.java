public class MainOverloadExample {

    // Original main method - entry point of the application
    public static void main(String[] args) {
        System.out.println("Original main method.");

        // Calling the overloaded main method
        main("Overloaded main method.");
    }

    // Overloaded main method with a single String parameter
    public static void main(String arg) {
        System.out.println(arg);
    }

    // You can add more overloaded versions with different parameters
    // For example:
    public static void main(int number) {
        System.out.println("Main method with integer: " + number);
    }
}