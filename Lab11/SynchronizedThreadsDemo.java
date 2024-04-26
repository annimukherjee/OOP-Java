package Lab11;

class Task {

    public synchronized void func1() {
        System.out.println(Thread.currentThread().getName() + " :I");
        System.out.println(Thread.currentThread().getName() + " :Love");
        System.out.println(Thread.currentThread().getName() + " :Java");
        System.out.println(Thread.currentThread().getName() + " :Very");
        System.out.println(Thread.currentThread().getName() + " :Much");
    }
}

class Mythread2 extends Thread {
    private Task task;
    String name;

    Mythread2(Task task, String s) {
        super(s);
        name = s;
        this.task = task;
    }

    public void run() {
        task.func1();
    }
}

public class SynchronizedThreadsDemo {
    public static void main(String[] args) {
        Task task = new Task();

        Mythread2 t1 = new Mythread2(task, "Thread 1");
        Mythread2 t2 = new Mythread2(task, "Thread 2");

        t1.start();
        t2.start();
    }
}