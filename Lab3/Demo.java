import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {

        Scanner s = new Scanner(System.in);
        System.out.print("Length: ");
        double l = s.nextDouble();
        
        System.out.print("Width: ");
        double w = s.nextDouble();

        System.out.print("Height: ");
        double h = s.nextDouble();

        Box b1 = new Box(l,w,h);
        
        b1.volume();
    }
}
