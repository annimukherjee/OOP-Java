package Lab11;

class Task {
    synchronized void call(String msg) {
        System.out.print("[ " + msg);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(" ]");
    }
}

class MyThread implements Runnable {
    Thread t;
    String msg;
    Task target;

    MyThread(Task a, String s) {
        target = a;
        msg = s;
        t = new Thread(this, s);
    }

    @Override
    public void run() {
        {
            // synchronized (target) {
            // target.call(msg);
            // }

            target.call(msg);
        }
    }
}

public class Synchro {
    public static void main(String[] args) {
        Task target = new Task();

        MyThread b1 = new MyThread(target, "Hello");
        MyThread b2 = new MyThread(target, "Synchronized");
        MyThread b3 = new MyThread(target, "World");

        b1.t.start();
        b2.t.start();
        b3.t.start();

        try {
            b1.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        try {
            b2.t.join();
            b3.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}