package Lab9_Strings;

public class Palindrome {
    public static void main(String[] args) {
        String original = "madam";
        System.out.println("Original string: " + original);

        String reversed = "";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}