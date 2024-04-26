package Lab_2;

// Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java.

import java.util.Scanner;

public class Lab_2_6_SumOfEachDiag {

    public static void display(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a[][] = new int[4][4];

        display(a);

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("a[" + i + "][" + j + "] = : ");
                a[i][j] = s.nextInt();
            }
            System.out.println();
        }

        display(a);

        int sumDiagRight = 0;
        int sumDiagLeft = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    // System.out.println(a[i][j] + " rightDiagEneted");
                    sumDiagRight += a[i][j];
                } else if (i + j == 3) {
                    // System.out.println(a[i][j] + " LeftDiagEntered");
                    sumDiagLeft += a[i][j];
                }
            }
        }

        System.out.println("\n\nLeft Diag Sum: " + sumDiagLeft);

        System.out.println("Right Diag Sum: " + sumDiagRight);

    }

}
