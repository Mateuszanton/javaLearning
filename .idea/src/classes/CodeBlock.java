package classes;

/**
 * Created by Matesteusz on 14.03.2018.
 */
public class CodeBlock {
    public static void main(String args[]) {
        double i, j, k;

        i = 5;
        j = 10;

        //instruction condition which decides of code block execution
        for (i = 5; i > -1; i --) {
            if (i > 0) {
                System.out.println("i is not equal 0"); // this
                k = j / i;                              // is
                System.out.println("j / i is: " + k);   // the code block
            } else
                System.out.println("i equal to 0");

        }
    }
}
