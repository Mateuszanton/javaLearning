package classes.chapterNo2;

/**
 * Created by Matesteusz on 17.03.2018.
 */
public class BooleanDemoClass {
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b is: " + b);
        b = true;
        System.out.println("now b is: "+ b);

        //Boolean controls the if instruction:
        if(b) System.out.println("the instruction is executed!");
        b = false;
        if(b) System.out.println("the instruction is not executed!");

        //conditional operators returns boolean too
        System.out.println("10 > 9 is a: " + (10 > 9));
    }
}
