package Lab8;

import java.util.Scanner;

class NoTryCatch {

    public static void main(String[] args) {

        int a = 10;
        int d;

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the denominator: ");
        d = s.nextInt();
        int c = a / d;

        System.out.println("Hello this is after division\nc: " + c);
        s.close();

    }

}
