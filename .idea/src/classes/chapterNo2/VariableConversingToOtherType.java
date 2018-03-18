package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class VariableConversingToOtherType {
    public static void main(String args []) {
        long i;
        float f;


        i = 10L;
        f = i; // assign the int to float type
        System.out.println("i and f: " + i + " " + f);

        //that part won't be compiled:
//        i = f;
//        System.out.println("the type is not correct");

    }
}