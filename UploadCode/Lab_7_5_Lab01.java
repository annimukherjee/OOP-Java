package UploadCode;

// Write a Java program to generate an 

// ArrayIndexOutofBoundsException and handle it using catch statement. 
// Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 ) 
// Output: Exception in thread “main” 
// java.lang.ArrayIndexOutOfBoundsException:4 

public class Lab_7_5_Lab01 {
    static int arr[] = { 3, 4, 2, 6, 9 };

    public static void main(String[] args) {
        try {
            arr[10] = 10; // Generates ArrayIndexOutofBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Check the array Index. It's out of Bounds");
        }
    }

}