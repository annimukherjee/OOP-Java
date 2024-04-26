package Lab0.mainclasscode;

import java.util.*;

public class Lab_0_3_NumberReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        reverse(num); // uses recursion
        System.out.print("\n");
        sc.close();

        // int num = 10;
        // int dig1 = num % 10;
        // System.out.println(dig1);
        // int dig2 = (num % 100) / 10;
        // System.out.println(dig2);
        // int dig3 = (num % 1000) / 100;
        // System.out.println(dig3);
        // int dig4 = (num % 10000) / 1000;
        // System.out.println(dig4);

        // System.out.println(dig1*1000 + dig2 * 100 + dig3*10 + dig4);

    }

    public static void reverse(int num) {
        if (num <= 0) {
            return;
        } else {
            System.out.print(num % 10);
            reverse(num / 10);
        }
    }
}
