package classes.chapterNo5.bitOperators;

public class LowCase {
    public static void main(String args[]) {
        char ch;

        for (int i = 0; i < 10; i++){
            ch = (char) ('A' + i);
            System.out.print(ch);

            //deleting 6th bit
            ch = (char) ((int) ch | 32); /* 32 is userd as a second argument of | operator which is equal to binary
            0000 0000 0010 0000 in that way 6th bit is situated of the score, other bits are not changed */

            //ch is now lowercase

            System.out.print(ch + " ");
        }
    }
}

/* 1010
   0110
|  1110
 */