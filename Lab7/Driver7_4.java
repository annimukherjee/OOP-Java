package Lab7;
// Define  an  interface  Emploee  with  a  method  getDetails()  to  get 

// emplyee  details  as  Empid  and  Ename.  Also  define  a  derived  interface  Manager  with  a 
// method  getDeptDetails()  to  get  department  details  such  as  Deptid  and  Deptname.Then 
// define a class Head which implements Manager interface and also prints all details of the 
// employee. Write the complete program to display all details of one head of the 
// department.

// interface Employee {

//     void getDetails(); // get emplyee details as Empid and Ename
// }

// interface Manager extends Employee {
//     void getDeptDetails(); // get department details such as Deptid and Deptname
// }

// class Head implements Manager {

// }

// public class Driver7_3 {

// }

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    private String empId;
    private String empName;
    private String deptId;
    private String deptName;

    public Head(String empId, String empName, String deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void getDetails() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
    }

    public void getDeptDetails() {
        System.out.println("Department ID: " + this.deptId);
        System.out.println("Department Name: " + this.deptName);
    }

    public void printAllDetails() {
        getDetails();
        getDeptDetails();
    }
}

public class Driver7_4 {
    public static void main(String[] args) {

        Head head = new Head("E001", "John Doe", "D001", "Sales");

        head.printAllDetails();
    }
}