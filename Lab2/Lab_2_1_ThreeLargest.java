package Lab2;

/*
Find  the  largest  among  3  user  entered  nos.  at  the  command 
prompt using Java
*/

import java.util.Scanner;

public class Lab_2_1_ThreeLargest {

    public static void main(String args[]) {

        // Scanner s = new Scanner(System.in);
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        if (n1 == n2 && n2 == n3) {
            System.out.println("Equal");
        }
        else if (n1 >= n2 && n1 >= n3) {
            System.out.println("Largest Number: " + n1);

        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("Largest Number: " + n2);
        } else if (n3 >= n2 && n3 >= n1) {

            System.out.println("Largest Number: " + n3);

        }
    }
}
