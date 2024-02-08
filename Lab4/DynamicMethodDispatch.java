package Lab4;

// 3. Aim of the program: Write a program in Java having three classes Apple, Banana

// and Cherry. Class Banana and Cherry are inherited from class Apple and each class
// have their own member function show) . Using Dynamic Method Dispatch concept
// display all the show) method of each class.
// Input: Mention show function of each class.
// Output: Display show function of each class accordingly.

class Apple {

    public void show() {
        System.out.println("Hi, I like Apples");
    }

}

class Banana extends Apple {

    public void show() {
        System.out.println("Hi, I like Bananas");
    }
}

class Cherry extends Apple {
    public void show() {
        System.out.println("Hi, I like Cherry");
    }

}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Apple b = new Banana();
        Apple c = new Cherry();
        
        b.show();
        c.show();
    }

}
