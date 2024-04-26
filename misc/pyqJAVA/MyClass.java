public class MyClass {
    private static int x = 10;

    static int m1() {
        int y = x;
        return y;
    }

    public static void main(String[] args) {
        m1();

        int[] myarr4[] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int[] is : myarr4) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
    }
}
