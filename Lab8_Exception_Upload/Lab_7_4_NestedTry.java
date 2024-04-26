package Lab8_Exception_Upload;

public class Lab_7_4_NestedTry {
    public static void main(String[] args) {
        try {

            int d = Integer.parseInt(args[0]);

            System.out.println("d: " + d);

            int res = 15 / d;

            try {
                if (d == 1) {
                    System.out.println("in nested try, ArthExcep");
                    d = d / (d - d);
                }
                if (d == 2) {
                    System.out.println("in nested try, ArrayIndexOutOfBounds");
                    int x[] = { 1 };
                    x[34] = 10;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}