package Lab8_Exception_Upload;

// Write  a  program  to  create  user  defined  exceptions  called 
// HrsException, MinException and SecException. Create a class Time which 
// contains  data  members  hours,  minutes,  seconds  and  a  method  to  take  a  time 
// from user which throws the user defined exceptions if hours (>24 
// &<0),minutes(>60 &<0),seconds(>60 &<0).

import java.util.Scanner;

class HrsException extends Exception {

    public String toString() {
        return "check hrs in limits";
    }
}

class MinException extends Exception {
    public String toString() {
        return "check min in limits";
    }
}

class SecException extends Exception {
    public String toString() {
        return "check sec in limits";
    }
}

class Time {
    int hrs, min, sec;

    void getTheTime() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the hours");
        hrs = s.nextInt();
        System.out.println("enter the min");
        min = s.nextInt();
        System.out.println("enter the sec");
        sec = s.nextInt();

        s.close();
        try {
            if (hrs > 24 || hrs < 0) {
                throw new HrsException();
            } else {
                System.out.println("Correct Hours: " + hrs);
            }

        } catch (HrsException e) {
            System.out.println(e);
        }
        try {
            if (min > 59 || min < 0) {
                throw new MinException();
            } else {
                System.out.println("Correct Min: " + min);
            }
        } catch (MinException e) {
            System.out.println(e);
        }
        try {

            if (sec > 60 || sec < 0) {
                throw new SecException();
            } else {
                System.out.println("Correct Sec: " + sec);
            }
        } catch (SecException e) {
            System.out.println(e);
        }
    }

}

public class Lab_7_8_Hrs_Mins {
    public static void main(String[] args) {
        Time t = new Time();
        t.getTheTime();
    }
}