package Lab9_Strings;

import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Change the case of the string
        System.out.println("Swapped case: " + swapCase(str1));

        // Reverse the string
        System.out.println("Reversed string: " + new StringBuilder(str1).reverse().toString());

        // Compare two strings
        System.out.println("Strings are equal: " + str1.equals(str2));

        // Insert one string into another string
        System.out.println("Combined string: " + str1 + str2);

        // Convert the string to upper case and lower case
        System.out.println("Upper case: " + str1.toUpperCase());
        System.out.println("Lower case: " + str1.toLowerCase());

        // Check whether the character is present in the string and at which position
        int index = str1.indexOf(ch);
        if (index != -1) {
            System.out.println("Character found at position: " + (index + 1));
        } else {
            System.out.println("Character not found in string");
        }

        // Check whether the string is palindrome or not
        System.out.println("Is palindrome: " + str1.equals(new StringBuilder(str1).reverse().toString()));

        // Check the number of word, vowel and consonant in the string
        int words = str1.split(" ").length;
        int vowels = countVowels(str1);
        int consonants = str1.length() - countSpaces(str1) - vowels;
        System.out.println("Words: " + words + ", Vowels: " + vowels + ", Consonants: " + consonants);
    }

    private static String swapCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    private static int countSpaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
}