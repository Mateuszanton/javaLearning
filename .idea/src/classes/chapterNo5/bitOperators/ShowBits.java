package classes.chapterNo5.bitOperators;

public class ShowBits {
    public static void main(String args[]) {
        int t;
        byte val;

        val = 123;
        for (t = 128; t > 0; t = t / 2) {
            //prints binary value in byte type
            if ((val & t) != 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}