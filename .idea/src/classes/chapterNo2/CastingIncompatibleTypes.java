package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class CastingIncompatibleTypes {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //cast double to int
        System.out.println("x / y in integer type = " + i);

        i = 100;
        b = (byte) i; // no information is lost, byte can reprezent value of 100
        System.out.println("b = " + b);

        i = 257;
        b = (byte) i; //information lost, bye cannot reprezent value >127
        System.out.println("b = " + b);

        b = 88; // coe ASCII for X letter
        ch = (char) b; //Casting incompatibile type
        System.out.println("ch = " + ch);

    }
}
