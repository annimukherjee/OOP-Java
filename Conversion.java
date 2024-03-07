// interface Address {
//     String getAddress();
//     void setAddress(String address);
// }

// class HomeAddress implements Address {
//     private String address;

//     @Override
//     public String getAddress() {
//         return address;
//     }

//     @Override
//     public void setAddress(String address) {
//         this.address = address;
//     }
// }

// class OfficeAddress implements Address {
//     private String address;

//     @Override
//     public String getAddress() {
//         return address;
//     }

//     @Override
//     public void setAddress(String address) {
//         this.address = address;
//     }
// }

// class SchoolAddress implements Address {
//     private String address;

//     @Override
//     public String getAddress() {
//         return address;
//     }

//     @Override
//     public void setAddress(String address) {
//         this.address = address;
//     }
// }

// public class AddressDemo {
//     public static void main(String[] args) {
//         Address home = new HomeAddress();
//         Address office = new OfficeAddress();
//         Address school = new SchoolAddress();

//         // Set addresses using setAddress
//         home.setAddress("123 Home Street, Hometown");
//         office.setAddress("456 Office Avenue, Worktown");
//         school.setAddress("789 School Road, Schooltown");

//         // Display addresses using getAddress
//         System.out.println("Home Address: " + home.getAddress());
//         System.out.println("Office Address: " + office.getAddress());
//         System.out.println("School Address: " + school.getAddress());
//     }
// }

class Conversion {
    public static void main(String args[]) {
        char b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        b = (char) i;
        System.out.println("i and b " + i + " " + (int) b);
        System.out.println("Conversion of double to byte");
        b = (char) d;
        System.out.println("d and b " + d + " " + (int) b);
    }
}