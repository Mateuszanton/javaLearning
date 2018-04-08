package classes.chapterNo3;

public class Calc2ToThePower {
    public static void main(String args[]) {
        int e;
        int result;

        for (int i = 0; i < 10; i++) {

            e = i;
            result = 1;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the power " + i + " is equal to: " + result);
        }
    }
}
