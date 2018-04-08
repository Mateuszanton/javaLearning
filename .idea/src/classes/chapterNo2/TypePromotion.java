package classes.chapterNo2;

public class TypePromotion {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; //casting is not necessary, result is promoted to int

        b = 10;
        b = (byte) (b * b); //the casting is necessary to assign type int to byte variable

        System.out.println("i and b: " + i + " " + b);

        /*
        Firstly the expression variables e.g. char, byte, short are promoted to int then when one of the arguments
        is long, the whole expression is promoted to long type.
         */

        //example with the char type var:
        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);   //without casting the expression would be int -> it's not possible to assign int
                                    // to char var
    }
}
