package Lab10_Threads;

class newthread implements Runnable {
    Thread t;
    String name;

    public newthread(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println(t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("name-" + i);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ClassOne {
    public static void main(String[] args) {
        newthread nt = new newthread("MyThread");
        nt.t.start();

        try {
            for (int j = 0; j > 0; j--) {
                System.out.println("Main- " + j);
                Thread.sleep(20);

            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}