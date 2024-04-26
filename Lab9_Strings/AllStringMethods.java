package Lab9_Strings;

import java.util.Scanner;

class test {
    public String toString() {
        return "Demo String";
    }
}

public class AllStringMethods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        test t = new test();

        System.out.println("\nCreating a new object of class 'test' and calling its toString method:");
        System.out.println("New toString: " + t);

        int a = 40;
        String s1 = String.valueOf(a);
        System.out.println("\nConverting integer 40 to string:");
        System.out.println("String value of 40: " + s1);

        char ch = "abc".charAt(1);
        System.out.println("\nGetting character at index 1 of string 'abc':");
        System.out.println("Char at index 1 of abc: " + ch);

        String s2 = "HelloWorld";
        char arr[] = new char[5];
        s2.getChars(0, 5, arr, 0);
        System.out.println("\nGetting first 5 characters from string 'HelloWorld':");
        for (char i : arr) {
            System.out.println(i);
        }

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "HELLO";

        boolean b1 = str1.equals(str2);
        boolean b2 = str1.equalsIgnoreCase(str3);
        boolean b3 = str2.equals(str3);
        boolean b4 = str1 == str2;
        int b5 = str1.compareTo(str3);

        System.out.println("\nComparing strings:");
        System.out.println("str1 equals str2: " + b1);
        System.out.println("str1 equals str3 (ignoring case): " + b2);
        System.out.println("str2 equals str3: " + b3);
        System.out.println("str1 == str2: " + b4);
        System.out.println("str1 compared to str3: " + b5);

        String s = "This is KIIT";
        int aa = s.indexOf("i");
        int b = s.lastIndexOf("i");
        int c = s.indexOf("is");

        System.out.println("\nFinding index of 'i' and 'is' in string 'This is KIIT':");
        System.out.println("First index of 'i': " + aa);
        System.out.println("Last index of 'i': " + b);
        System.out.println("Index of 'is': " + c);

        String substr = s.substring(5);
        System.out.println("\nGetting substring from index 5 of string 'This is KIIT':");
        System.out.println("Substring: " + substr);

        sc.close();
    }

}