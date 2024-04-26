
interface LOL {
    public default void show() {
        System.out.println("LOL1");
    }
}

interface LOL2 {
    public default void show() {
        System.out.println("LOL2");
    }
}

class Cl_A implements LOL, LOL2 {
    public void show() {
        System.out.println("in CL_A");
    }

}

class Test {
    public static void main(String[] args) {
        Cl_A a = new Cl_A();

        a.show();
    }
}