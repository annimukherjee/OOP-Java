import java.util.Scanner;

// Define the Employee interface
interface Employee {
    void getDetails();
}

// Define the Manager interface, derived from Employee
interface Manager extends Employee {
    void getDeptDetails();
}

// Define the Head class implementing the Manager interface
class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    // Implement the getDetails method from the Employee interface
    public void getDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
    }

    // Implement the getDeptDetails method from the Manager interface
    public void getDeptDetails() {
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    // Method to set employee details
    public void setEmployeeDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // Method to set department details
    public void setDeptDetails(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee id: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();

        // Input department details
        System.out.print("Enter department id: ");
        int deptId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();

        // Create an instance of Head class
        Head head = new Head();

        // Set employee details
        head.setEmployeeDetails(empId, empName);

        // Set department details
        head.setDeptDetails(deptId, deptName);

        // Display all details
        System.out.println("Output:");
        head.getDetails();
        head.getDeptDetails();

        scanner.close();
    }
}
