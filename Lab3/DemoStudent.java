import java.util.Scanner;

public class DemoStudent {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = s.nextInt();

        Student students[] = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name: ");
            String name = s.next();

            System.out.print("Enter the roll: ");
            int roll = s.nextInt();

            System.out.print("Enter the cgpa: ");
            double cgpa = s.nextDouble();

            students[i] = new Student(roll, name, cgpa);
            // students[i].input();

        }
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        double min = students[0].cgpa;
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].cgpa < min) {
                min = students[i].cgpa;
                index = i;
            }
        }

        System.out.println("The student with minimum cgpa is:  " + students[index].name);

    }
}
