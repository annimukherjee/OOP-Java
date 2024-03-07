package Lab6.Marketing;

import java.util.Scanner;

import Lab6.General.*;

public class sales extends employee {

    public double tallowance(double base_sal) {

        Scanner s = new Scanner(System.in);
        // String ename = s.nextLine();
  
        // double trav_allow = 0.05 * base_sal;
        employee ee = new employee();
        double trav_allow = 0.05 * ee.earning(base_sal);

        return trav_allow;
    }
}
