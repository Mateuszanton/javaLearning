package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class VariableRange {
    public static void main(String args[]) {
        int x = 10;

        if (x == 10) { //new block
            int y = 20; //visible only here
            System.out.println("both variables are visible here: \nx =  " + x + "y =  " + y);
        } //end of the inner block
        //y = 100; //the y is not available - out of the inner {} range
        System.out.println("x is still visible here : " + x);
    }
}
