package Lab6.General;

// In  General 

// package  define  a  class  ‘employee’    with  data  members  as  empid(protected), 
// ename(private) and a public method as earnings() which calculate total earnings as 

// earnings basic + DA (80% of basic) + HRA (15% of basic)



public class employee {
    protected int empid;
    protected String ename;

    public double earning(double basic) {

        double da = 0.8 * basic;
        double hra = 0.15 * basic;

        double earning = basic + da + hra;

        return earning;
    }

}
