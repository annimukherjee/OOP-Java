import java.util.Scanner;

public class hackerrankq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        // String s=???; Complete this line below

        String s = "";
        // Write your code here
        while (n != 0) {
            int digit = n % 10;

            s = (char) (48 + digit) + s;

            n /= 10;
        }

        System.out.println(s);
    }

}
