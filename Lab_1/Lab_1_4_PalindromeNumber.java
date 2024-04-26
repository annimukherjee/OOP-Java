package Lab_1;
// import java.util.Scanner;

// public class Plaindrome {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int num = s.nextInt();

//         String str_num = Integer.toString(num);

//         for (int i = str_num.length(); i > -1; i--) {

//         }

//     }
// }

import java.util.Scanner;

public class Lab_1_4_PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int x = num;

        while (x > 0) {
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }

        if (rev == num) {
            System.out.println("Yes, Palindrome");
        } else {
            System.out.println("No, not Palindrome");
        }

        sc.close();

    }

}
