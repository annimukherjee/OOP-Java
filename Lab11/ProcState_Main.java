package Lab11;

class ProcState implements Runnable {
    Thread t;
    String name;

    ProcState(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("Thread: " + t);
    }

    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("MyThread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ProcState_Main {
    public static void main(String[] args) {
        ProcState nt = new ProcState("MyThread");

        System.out.println(">>>>>>>>>>> State before start: " + nt.t.getState()+ " <<<<<<<<<<<<<<<<<<<<<<<<");

        nt.t.start();

        try {
            System.out.println(">>>>>>>>>>> State after start: " + nt.t.getState()+ " <<<<<<<<<<<<<<<<<<<<<<<<");

            for (int i = 10; i > 0; i--) {
                System.out.println("Main: " + i);
                Thread.sleep(500);
                System.out.println(">>>>>>>>>>> State before join: " + nt.t.getState()+ " <<<<<<<<<<<<<<<<<<<<<<<<");
            }

            nt.t.join();
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(">>>>>>>>>>> State after join: " + nt.t.getState() + " <<<<<<<<<<<<<<<<<<<<<<<<");
    }
}