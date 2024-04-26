package Lab10_Threads;

import java.util.Scanner;

class NewThread implements Runnable {
    String name;
    int x, y;
    Thread t;

    NewThread(String s, int x, int y) {
        this.name = s;
        this.x = x;
        this.y = y;
        this.t = new Thread(this);
    }

    public void run() {
        try {
            for (int i = this.x; i <= this.y; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class Lab9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound:");
        int x = sc.nextInt();

        System.out.print("Enter upper bound: ");
        int y = sc.nextInt();

        NewThread n1 = new NewThread("Thread 1", x, y);
        n1.t.start();

        sc.close();
    }
}