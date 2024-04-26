package Lab10_Threads;

class threadDemo implements Runnable {
    Thread t;
    String name;

    threadDemo(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("User thread: " + t);
    }

    public void run() {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(name + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}

public class Lab9_1 {
    public static void main(String[] args) {
        threadDemo nt = new threadDemo("MyThread");

        nt.t.start();

        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println("Main-" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}