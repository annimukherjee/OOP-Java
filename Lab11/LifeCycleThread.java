package Lab11;

class ThreadDemo implements Runnable {
    Thread t;
    String name;

    ThreadDemo(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("User thread: " + t);
    }

    @Override
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

public class LifeCycleThread {
    public static void main(String[] args) {
        ThreadDemo newthread = new ThreadDemo("MyThread");

        System.out.println(">>>>>>>>> GETTING STATE <<<<<<<");
        System.out.println(newthread.t.getState());
        System.out.println(">>>>>>>>>-------------<<<<<<<");

        newthread.t.start();

        System.out.println(">>>>>>>>> GETTING STATE <<<<<<<");
        System.out.println(newthread.t.getState());
        System.out.println(">>>>>>>>>-------------<<<<<<<");

        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println("Main: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(">>>>>>>>> GETTING STATE <<<<<<<");
        System.out.println(newthread.t.getState());
        System.out.println(">>>>>>>>>-------------<<<<<<<");

        try {
            newthread.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(">>>>>>>>> GETTING STATE <<<<<<<");
        System.out.println(newthread.t.getState());
        System.out.println(">>>>>>>>>-------------<<<<<<<");

    }
}