package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class RelationalOperators {
    public static void main(String args[]) {
        int i = 10, j = 11;
        boolean a = true, b = false;

        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("i == j");   //won't be executed == false
        if (i >= j) System.out.println("i >= j");   //won't be executed == false
        if (i > j) System.out.println("i > j");     //won't be executed == false

        if (a & b) System.out.println("false");      //won't be executed == false
        if (!(a & b)) System.out.println("true");
        if (a | b) System.out.println("true");
        if (a ^ b) System.out.println("true"); //XOR operator false: when false & false And true & true
    }
}
