package Lab_2;
// Accept 10 numbers from command line and check how many of them are even and how many are odd.

import java.util.Scanner;

public class Lab_2_2_EvenOdd {

    public static void main(String[] args) {

        int a[] = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int even = 0, odd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even += 1;
            } else if (a[i] % 2 != 0) {
                odd += 1;
            }
        }

        System.out.println("Num of Even: " + even);
        System.out.println("Num of Odd: " + odd);

    }

}
