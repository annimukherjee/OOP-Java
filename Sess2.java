class Sess2 {

    static int[] ARR = new int[100];
    static int[] evenArr = new int[50];
    static int[] oddArr = new int[50];

    public static synchronized void storeOdd() {
        int l = 0;
        for (int i = 0; i < ARR.length; i++) {
            if (i % 2 != 0) {
                ARR[i] = i;
                System.out.print(i + " ");
                oddArr[l++] = i;
            }
        }

        // for (int i = 0; i < 50; i++) {
        // System.out.print(evenArr[i]);
        // }
    }

    public static synchronized void storeEven() {
        int l = 0;
        for (int i = 0; i < ARR.length; i++) {
            if (i % 2 == 0) {
                ARR[i] = i;
                System.out.print(i + " ");
                evenArr[l++] = i;
            }
        }

        // for (int i = 0; i < 50; i++) {
        // System.out.println(evenArr[i]);
        // }
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(() -> storeOdd());
        Thread t2 = new Thread(() -> storeEven());

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Printing ARR in the main
        System.out.println("\nEven Arr\n-----------------------");
        for (int i = 0; i < 50; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println("\nOdd Ar\n-----------------------");
        for (int i = 0; i < 50; i++) {
            System.out.print(oddArr[i] + " ");
        }


        // System.out.println("\nARR");
        // for (int i = 0; i < 100; i++) {
        //     System.out.print(ARR[i] + " ");
        // }

        // Copying
        for (int i = 0; i < 50; i++) {
            ARR[i] = oddArr[i];
        }
        for (int i = 50; i < 100; i++) {
            ARR[i] = evenArr[i - 50];
        }

        System.out.println("\nARR");
        for (int i = 0; i < 100; i++) {
            System.out.print(ARR[i] + " ");
        }
    }
}