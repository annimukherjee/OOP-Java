
class Address {

    String city, state, country, zip, street;

    // initialize Address using constructor
    public Address(String street, String city, String state, String zip, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.street = street;
        this.zip = zip;
    }
}

class Employee {
    int empId;
    String empName;
    Address empAddress;

    public Employee(int empId, String empName, Address empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    void display() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + empAddress.street + " " + empAddress.city + " " + empAddress.state + " "
                + empAddress.zip + " " + empAddress.country);
    }

    public static void main(String[] args) {
        Address add1 = new Address("School of Computer Engineering (Campus-15) KIIT", "Bhubaneswar", "Odisha", "751024",
                "India");
        Address add2 = new Address("School of Electronics Engineering (Campus-12) KIIT", "Bhubaneswar", "Odisha",
                "751024", "India");

        Employee employee1 = new Employee(001, "Ramesh", add1);
        Employee employee2 = new Employee(002, "Soumya", add2);

        employee1.display();
        employee2.display();

    }
}