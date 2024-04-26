
class A {
    static int count;
    int x;

    A() {
        x = 10;
        count += 1;
    }

    A(int p) {
        x = p;
        count++;
    }

    public static void dispCount() {
        System.out.println(count);
    }
}

public class CountObj_Twist {
    public static void main(String[] args) {
        A a1 = new A();
        A.dispCount();
        A b = new A(10);

        A.dispCount();

    }
}
