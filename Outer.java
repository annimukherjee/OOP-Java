public class Outer {
    int x = 10;

    class Inner {
        int x = 100;

        void show(int x) {
            System.out.println(x);
        }
    }

    class InnerSub extends Inner {
        int x = 1000;

        void show(int x) {
            super.show(this.x);
        }
    }

    public static void main(String[] args) {
        int x = 10000;
        new Outer().new InnerSub().show(x);
    }

}
