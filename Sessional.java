class Sessional {

    static int[] ARR = new int[100];
    static int[] evenArr = new int[50];
    static int[] oddArr = new int[50];

    public static void storeOdd() {
        for (int i = 0; i < ARR.length; i++) {
            int k = 0;
            int l = 0;
            if (i % 2 != 0) {
                ARR[k++] = i;
                System.out.print(i + " ");
                oddArr[l++] = i;
            }
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(evenArr[i]);
        }
    }

    public static void storeEven() {
        for (int i = 0; i < ARR.length; i++) {
            int k = 50;
            int l = 0;
            if (i % 2 == 0) {
                ARR[k++] = i;
                System.out.print(i + " ");
                evenArr[l++] = i;
            }
        }

        for (int i = 0; i < 50; i++) {

            System.out.println(evenArr[i]);

        }
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(() -> storeOdd());
        Thread t2 = new Thread(() -> storeEven());

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join()

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            System.out.println(e);
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            System.out.println(e);
        }

        // Printing ARR in the main

        // for
        System.out.println("\nEven Arr");
        for (int i = 0; i < 50; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println("\nOdd Arr");
        for (int i = 0; i < 50; i++) {
            System.out.print(oddArr[i] + " ");
        }

        System.out.println("\nARR");
        for (int i = 0; i < 100; i++) {
            System.out.print(ARR[i] + " ");
        }

    }

}