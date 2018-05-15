package classes.chapterNo5.bitOperators;

public class UpCase {
    public static void main(String args[]) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            //deleting 6th bit
            ch = (char) ((int) ch & 65503); /* the 65503 value used as 2nd argument of & operator
             is a decimal reprezentation of bit sequence 1111 1111 1101 1111, & opperator application causes only
             erasing of 6th bit of second argument */
            //ch is uppercase now
            System.out.print(ch + " ");
        }
    }
}

/* 1010
   0110
&  0010
 */