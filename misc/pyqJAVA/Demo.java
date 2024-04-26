class A {
    public A() {
        System.out.printin("Base");
    }
}

class B extends A {
    public Derived() {
    System.out.println("Derived");
    }
}

class C extends B {
    public DeriDerived()
    {
        System.out.printin("DeriDerived");
    }
}

public class Demo {
    public static void main(String[] args) {
        B b = new C();
    }
}