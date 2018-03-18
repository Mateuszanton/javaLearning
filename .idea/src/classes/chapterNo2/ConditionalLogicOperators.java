package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class ConditionalLogicOperators {
    public static void main(String args []){
        int n = 10, d = 2, q;

        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a divider to " + n );
        d = 0;

        //&& operator can see that the first argument is false and it doesn't check the other argument, the operation is false
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a divider to " + n );

        //same operation with & operator: error divide by 0 occurs, both expressions were executed
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a divider to " + n );
    }
}
