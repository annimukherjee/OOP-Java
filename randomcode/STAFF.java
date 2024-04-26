// import java.util.Scanner;

// // Define interface
// interface Employee {
//     double earnings(double basic);

//     double deductions(double basic);

//     double bonus(double basic);
// }

// // Define Manager class implementing the interface
// class Manager implements Employee {
//     @Override
//     public double earnings(double basic) {
//         double DA = 0.8 * basic;
//         double HRA = 0.15 * basic;
//         return basic + DA + HRA;
//     }

//     @Override
//     public double deductions(double basic) {
//         return 0.12 * basic; // 12% of basic for PF deduction
//     }

//     // Implementing bonus method is not required in this class
//     @Override
//     public double bonus(double basic) {
//         return 0; // Bonus not applicable for manager
//     }
// }

// // Define Substaff class extending from Manager and implementing bonus method
// class Substaff extends Manager {
//     @Override
//     public double bonus(double basic) {
//         return 0.5 * basic; // 50% of basic for bonus
//     }
// }

public class STAFF {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the basic salary: ");
        // double basicSalary = scanner.nextDouble();

        // // Creating Substaff object
        // Substaff substaff = new Substaff();

        // // Calculate earnings, deductions, and bonus
        // double earnings = substaff.earnings(basicSalary);
        // double deductions = substaff.deductions(basicSalary);
        // double bonus = substaff.bonus(basicSalary);

        // // Displaying the results
        // System.out.println("Earnings: " + earnings);
        // System.out.println("Deductions: " + deductions);
        // System.out.println("Bonus: " + bonus);

        System.out.println('2'+'2');

    }
}
