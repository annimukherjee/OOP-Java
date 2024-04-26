package Lab10_Threads;

public class CountDownThread implements Runnable {
    private int start;

    public CountDownThread(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i >= 90; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        CountDownThread task = new CountDownThread(100);

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}