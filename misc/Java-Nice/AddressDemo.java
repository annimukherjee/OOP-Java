interface Address {
    void setAddress(String address);

    String getAddress();
}

class HomeAddress implements Address {
    private String address;

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return "Home Address: " + address;
    }
}

class OfficeAddress implements Address {
    private String address;

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return "Office Address: " + address;
    }
}

class SchoolAddress implements Address {
    private String address;

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return "School Address: " + address;
    }
}

public class AddressDemo {
    public static void main(String[] args) {
        Address home = new HomeAddress();
        Address office = new OfficeAddress();
        Address school = new SchoolAddress();

        home.setAddress("1234 Maple Street, Hometown");
        office.setAddress("5678 Oak Street, Business Park");
        school.setAddress("9012 Pine Street, Education City");

        System.out.println(home.getAddress());
        System.out.println(office.getAddress());
        System.out.println(school.getAddress());
    }
}
