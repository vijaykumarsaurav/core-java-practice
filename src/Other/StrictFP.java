package Other;



import java.util.*;

public class StrictFP {
    public static void main(String[] argv) {
        double d = Double.MIN_VALUE; 
        System.out.println("non strictfp : " + notStrictFP(d)); // may be 4.9E-324
        System.out.println("strictfp : " + strictFP(d)); // should be 0
    }

    static double notStrictFP(double a) {
        return (a / 2 ) * 2;
    }
    static strictfp double strictFP(double a) {
        return (a / 2 ) * 2 ;
    }
}