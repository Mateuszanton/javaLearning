package classes.chapterNo5.bitOperators;

public class ShiftOperatorDemo {
    public static void main(String args[]) {
        int val = 1;

        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
            val = val << 1; //left shift
        }
        System.out.println();

        val = 128;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1; //right shift
        }
    }
}
/*
shift left << number of bits
shift right >> number of bits
shift right unsigned-shift >> number of bits
 */