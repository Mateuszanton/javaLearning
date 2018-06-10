package classes.chapterNo5.ternaryOperator;

public class TernaryOperatorExample {
    public static void main(String args[]) {

        /*
        If-else intruction
       if(condition)
       variable = expression1;
       else
       variable = expression2;

       can be replaced with ? operator by:

       Expression1 ? Expression2 : Expression3;

       Expression1 is always boolean
       Expression2 and Expression3 types have to be compatibile or the same.
       If Expression1 is true Expression2 is determined, it's result becomes a result for whole ? expression
       If Expression1 is false Expression3 is determined and it's results becomes a result for whole ? expression.
         */
        int val, absval;
        val = -11;
        absval = val < 0 ? -val : val;
        System.out.println("variable " + val + " absolute value is equal to " + absval);

        /*
        The ? instruction suits to if-else
        if(val < 0)
        absval = -val;
        else absval = val;
        */
    }
}
