package classes;

/**
 * Created by Matesteusz on 13.03.2018.
 */
public class IfInstruction {
    public static void main(String args[]) {
        int a, b, c;

        a = 3;
        b = 2;

        if (a > b)
            System.out.println("a is greater than b");
        else
            System.out.println("variables values not correct");
        System.out.println();

        c = a - b;

        if (c > 0)
            System.out.println("c is greater than 0");

        else
            System.out.println("c less than or equal to 0");
        System.out.println();

        c = b - a;

        if (c >= 0)
            System.out.println("c greater than or equal to 0");
        else
            System.out.println("c is less than 0");

    }
}
