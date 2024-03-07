package Lab6;

import java.util.Scanner;

import Lab6.General.employee;
import Lab6.Marketing.sales;

// Enter the employee id and emploee name 123   Amit 
// Enter the basic salary 1000

public class Driver_6one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name ");
        String ename = s.nextLine();
        
        System.out.print("Enter the eid ");
        int emp_id = s.nextInt();
        System.out.print("Enter the base: ");
        double base_sal = s.nextDouble();

        System.out.print("The empid is: \n" + emp_id);

        Lab6.General.employee e = new Lab6.General.employee();
        Lab6.Marketing.sales sal = new Lab6.Marketing.sales();

        double total_earning = e.earning(base_sal);

        System.out.println("Trav allow: "+   sal.tallowance(base_sal));

        System.out.println("Total earning is: " + total_earning);

    }
}
