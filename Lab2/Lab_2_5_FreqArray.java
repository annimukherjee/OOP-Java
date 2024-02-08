package Lab2;
// Find the no. of occurrence of each element in a user entered list of nos.

import java.util.Scanner;

public class Lab_2_5_FreqArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a list of number: ");
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("The list of number: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int dup[] = new int[5];
        boolean flag = true;
        int c = -1;

        for (int i = 0; i < a.length; i++) {
            int f = 0;

            for (int j = 0; j < dup.length; j++) {
                if (dup[j] == a[i]) {
                    flag = false;
                }
            }

            if (flag) {

                // Count freq
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        f += 1;
                    }
                }

                // Store the element u just calculated freq for in an array called dup
                c += 1;
                dup[c] = a[i];

                // Set flag == true for next iteration
                flag = true;
                System.out.println("The frequency of " + a[i] + " is [" + f + "]");
            }

        }

    }

}
