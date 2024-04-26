import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();

        System.out.println("Sum = " + (a + b));
    }
}

