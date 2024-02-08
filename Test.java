class A {
    A() {
        System.out.println("Hi, I'm in A");
    }
}

class B extends A {
    B() {
        System.out.println("Hi, I'm in b");
    }
}

class C extends B {
    C() {
        System.out.println("Hi, I'm in c");
    }
}

class D extends C {
    D() {
        System.out.println("Hi, I'm in d");
    }
}

public class Test {
    public static void main(String[] args) {
        D d = new D();
    }
}