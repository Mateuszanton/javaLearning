package classes.chapterNo2;

public class PrimaryNumberPrint {
    public static void main(String args[]) {
        int x;
        int i;
        double q;
        double k;
        //TODO
        for (x = 2; x <= 100; x++) {
            for (i = 1; i <= x; i++) {
                q = x % i;
                k = x / i;
//        reszta z dzielenia  liczba calkowita, > 1

                if (q == 0 && (x == i) || (i == 1) && (x > 2))
                    // if (k = x , k > 1|????)
                    System.out.println(x + " " + i);
            }

        }
    }
}
