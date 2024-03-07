package Lab7.InnerClasses;

import Lab7.InnerClasses.member.member_inner;

class member {

    private int x = 10;

    class member_inner {

        public void member_inner_status() {
            System.out.println("Hi i am inside member inner");
            System.out.println(x);
        }
    }
}

public class main_member {
    public static void main(String[] args) {

        member m = new member();
        member_inner m_in = m.new member_inner();

        m_in.member_inner_status();
    }

}

// ERROR: Could not find or load main class main_member Caused by:
// java.lang.NoClassDefFoundError: main_member (wrong name:
// Lab7/InnerClasses/main_member)

// The error message you're seeing is due to the way Java handles packages. When
// you try to run the main_member class, Java is expecting it to be in the
// Lab7.InnerClasses package because that's what you've specified at the top of
// your file. However, it seems like you're trying to run the file from the
// directory where it's located, which doesn't match the package structure.

// Here's how you can fix this:

// Ensure your directory structure matches your package structure. If your
// package is Lab7.InnerClasses, then your main_member.java file should be
// located in a directory called InnerClasses, which is inside a directory
// called Lab7.

// Compile your Java file with javac Lab7/InnerClasses/main_member.java from the
// root directory (the directory that contains the Lab7 directory).

// Run your program with java Lab7.InnerClasses.main_member from the root
// directory.

// Remember, Java uses the directory structure to understand the package
// structure, so they need to match.
