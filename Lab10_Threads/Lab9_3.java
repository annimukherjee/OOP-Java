package Lab10_Threads;

public class Lab9_3 implements Runnable {

    public void run() {
        for (int i = 100; i >= 90; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Lab9_3 t = new Lab9_3();

        Thread thread1 = new Thread(t, "Thread 1");
        Thread thread2 = new Thread(t, "Thread 2");
        Thread thread3 = new Thread(t, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}