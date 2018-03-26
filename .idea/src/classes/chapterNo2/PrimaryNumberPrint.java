package classes.chapterNo2;

public class PrimaryNumberPrint {
    public static void main(String args[]) {
        int x;
        int y = 0;
        double div = 0;
        System.out.println("primary numbers:  ");
        for (x = 2; x <= 100; x++) {
            for (y = 1; y < x; y++)
                if (x % x == 0 && x % 1 == 0 && x % y == 0)
            System.out.println(x);
        }
    }
}
