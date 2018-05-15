package classes.chapterNo5.bitOperators;

public class NotOperatorDemo {
    public static void main(String args[]) {
        byte b = -34; //bytes which will be reversed

        //creating b in byte form
        for (int t = 128; t > 0; t = t / 2) {
            if ((b & t) != 0)
                System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        //reverse all the bits
        b = (byte) ~b;

        for (int t = 128; t > 0; t = t / 2) {
            if ((b & t) != 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}
/* 1010
~  0101

 */