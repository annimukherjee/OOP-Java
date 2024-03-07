package Lab8;

// Create an user defined exception named CheckArgument to 
// check the number of arguments passed through command line. If the number of 
// arguments is less than four then throw the Check Argument exception, else print 
// the addition of squares of all the four elements.

class CheckArgument extends Exception {
    String args[];

    CheckArgument(String a[]) {
        System.out.println("There are less than 4 args!!!");
        args = new String[a.length];
        args = a;
    }

    public String toString() {
        System.out.println("The args received");

        return "Enter more than 4 arguments!!";
    }

}

class Lab7_5 {
    public static void main(String[] args) {
        int num_of_args = args.length;
        try {
            if (num_of_args <= 4) {
                throw new CheckArgument(args);
            }

            else {
                System.out.println("The arguments are: ");
                for (var each : args) {
                    System.out.println(each);
                }
            }

        } catch (CheckArgument e) {
            System.out.println(e);
        }

    }
}
