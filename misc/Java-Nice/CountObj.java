class A {
    static int count;

    A() {
        System.out.println("obj created!");
        count += 1;
    }

    public static void dispCount() {
        System.out.println(count);
    }
}

public class CountObj {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        A.dispCount();

    }
}
