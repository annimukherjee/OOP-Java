package Lab10_Threads;

class Mythread extends Thread {
    String name;

    Mythread(String s) {
        super(s);
        name = s;
    }

    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Lab9_2 {
    public static void main(String[] args) {
        Mythread t = new Mythread("Mythread");
        t.start();

        for (int i = 10; i > 0; i--) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
    }
}