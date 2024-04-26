package Lab_1;

import java.util.Scanner;

// Write a program to print the week day for the given day no. of 
// the  current month using switch case statement

// import java.util.Scanner;

// public class Lab_1_3_WeekDay {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.println("Enter the day of the month...");
//         int day = s.nextInt();

//         switch (day) {
//             case 1, 2, 3, 4, 5, 6, 7:
//                 System.out.println("Week 1");
//                 break;

//             case 8, 9, 10, 11, 12, 13, 14:
//                 System.out.println("Week 2");
//                 break;

//             case 15, 16, 17, 18, 19, 20, 21:
//                 System.out.println("Week 3");
//                 break;

//             case 22, 23, 24, 25, 26, 27, 28, 29, 30:
//                 System.out.println("Week 4");
//                 break;

//             default:
//                 break;
//         }

//         s.close();

//     }
// }

public class Lab_1_3_WeekDay {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the day of the month: ");
        int day = s.nextInt();

        switch(day)
        {
            case 1, 8, 15, 22, 29:
                System.out.println("Monday");
                break;
            case 2, 9, 16, 23, 30:
                System.out.println("Tuesday");
                break;
            case 3, 10, 17, 24:
                System.out.println("Wednesday");
                break;
            case 4, 11, 18, 25:
                System.out.println("Thursday");
                break;
            case 5, 12, 19, 26:
                System.out.println("Friday");
                break;
            case 6, 13, 20, 27:
                System.out.println("Saturday");
                break;
            case 7, 14, 21, 28:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        s.close();

    }
}