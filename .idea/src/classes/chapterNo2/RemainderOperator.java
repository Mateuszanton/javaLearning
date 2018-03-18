package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class RemainderOperator {
    public static void main(String args []){
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("For int variable 10 / 3 = " + iresult + " and the int remainder =  " + irem +
                "\nFor double variable 10 / 3 = " + dresult + " the double remainder = " + drem);
    }
}
