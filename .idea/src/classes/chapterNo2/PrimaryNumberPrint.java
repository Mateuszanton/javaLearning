package classes.chapterNo2;

public class PrimaryNumberPrint {
    public static void main(String args[]) {
        int i, j;
        for (i = 2; i < 100; i++) {
            boolean a = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                }
            }
            if (a) {
                System.out.println(i + ", ");
            }
        }
    }
}