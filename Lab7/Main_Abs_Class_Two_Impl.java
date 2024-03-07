package Lab7;

// Define the first abstract class
abstract class AbstractClass1 {
    abstract void method1();
}

// Define the second abstract class
abstract class AbstractClass2 {
    abstract void method2();
}

// Define an interface that combines functionalities of both abstract classes
interface CombinedInterface extends AbstractClass1, AbstractClass2 {
    // No need to define methods here, they are already defined in the abstract
    // classes
}

// Implement the CombinedInterface in a concrete class
class ConcreteClass implements CombinedInterface {
    // Implement method1() from AbstractClass1
    public void method1() {
        System.out.println("Implementation of method1");
    }

    // Implement method2() from AbstractClass2
    public void method2() {
        System.out.println("Implementation of method2");
    }
}

public class Main_Abs_Class_Two_Impl {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.method1();
        obj.method2();
    }
}
