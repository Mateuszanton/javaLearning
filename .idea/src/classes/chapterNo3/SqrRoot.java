package classes.chapterNo3;

public class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("square root of " + num + " is equal to " + sroot);

            //rounding error calc

            rerr = num - sroot * sroot;
            if (rerr != 0)
                System.out.println("AND the rounding mistake is equal to " + rerr);
            System.out.println();
        }
    }
}
