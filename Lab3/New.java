public class New {
    // 1 to 111 how many palindrome

    public static void main(String[] args) {

        // boolean palin = check_palindrome(121);
        // System.out.println(palin);

        for (int i = 0; i <= 111; i++) {

            boolean palin = check_palindrome(i);

            if (palin) {
                System.out.println(i);
            }
        }

    }

    public static boolean check_palindrome(int i) {

        int n = i;
        int rev = 0;

        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }

        // System.out.println(rev);

        if (rev == i) {
            return true;
        } else {
            return false;
        }

    }
}
