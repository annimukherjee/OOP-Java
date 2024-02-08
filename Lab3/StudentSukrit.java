import java.util.*;

class StudentSukrit {
    int roll;
    String name;
    double cgpa;

    StudentSukrit(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Name : " + name + "\nRoll No. : " + roll + "\nCGPA : " + cgpa + "\n");
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n = sc.nextInt();
        StudentSukrit ob[] = new StudentSukrit[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume the \n character
            System.out.println("Enter name of student " + (i + 1) + " : ");
            String nm = sc.nextLine();
            System.out.println("Enter roll number of student " + (i + 1) + " : ");
            int r = sc.nextInt();
            System.out.println("Enter cgpa of student " + (i + 1) + " : ");
            double cg = sc.nextDouble();
            ob[i] = new StudentSukrit(r, nm, cg);
        }
        double min = ob[0].cgpa;
        int cp = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(ob[i].cgpa);
            if (min > ob[i].cgpa) {
                min = ob[i].cgpa;
                cp = i;
            }
        }
        for (int i = 0; i < n; i++)
            ob[i].display();
        System.out.println("Student with lowest CGPA is = " + ob[cp].name);
    }
}