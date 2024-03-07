package Lab7;

// Define  an  interface  Motor  with  a  data  member  –capacity  and  two 
// methods  such  as  run()  and  consume().  Define  a  Java  class  ‘Washing  machine’  which 
// implements  this  interface  and  write  the  code  to  check  the  value  of  the  interface  data 
// member thru an object of the class.

interface Motor {
    int capacity = 100;

    public void run();

    public void consume();
}

class Washing_Machine implements Motor {

    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }

    // Method to check the value of the interface data member
    public void checkCapacity() {
        System.out.println("Capacity: " + capacity);
    }

    public static void main(String[] args) {
        Washing_Machine wm = new Washing_Machine();
        wm.run();
        wm.consume();
        wm.checkCapacity();

    }
}
