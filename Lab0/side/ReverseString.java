//package Lab1.side;

// Reverse a string without loop

public class ReverseString {
    int i = 0;

    public static void main(String[] args) {
        String s = "bobby";
        reverse(s, s.length());

    }

    public static void reverse(String s, int length) {
        reverse(s, s.length() - 1);
        System.out.println(s.charAt(length));
    }
}
