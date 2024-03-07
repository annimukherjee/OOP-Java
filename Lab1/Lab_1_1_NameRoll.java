package Lab1;
// Write  a  program  to  print  your  name,  roll  no,  section  and 

// branch in separate lines.

import java.util.Scanner;

public class Lab_1_1_NameRoll {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        int roll = s.nextInt();
        String section = s.next();
        String branch = s.next();

        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);

        s.close();
    }

}
