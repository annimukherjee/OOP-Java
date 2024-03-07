package Lab6.B;

import Lab6.A.cl1;

class cl2 extends cl1 {

    public void display() {
        System.out.println("hi i am in cl2 and package B");
    }

}

public class driver {
    public static void main(String[] args) {


            cl2 ob1 = new cl2();
            cl1 ob = new cl1();
    
            ob.disp();
            ob1.display();
    }
}