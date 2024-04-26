package Lab10_Threads;

public class Lab9_4 {
    public static void main(String[] args) {
        Runnable Even = new Even();
        Runnable Odd = new Odd();

        Thread thread1 = new Thread(Even);
        Thread thread2 = new Thread(Odd);

        thread1.start();
        thread2.start();
    }
}

class Even implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class Odd implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}