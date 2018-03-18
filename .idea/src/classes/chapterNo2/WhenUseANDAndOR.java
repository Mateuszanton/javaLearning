package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class WhenUseANDAndOR {
    public static void main(String args[]) {
        int i = 0;

        //logic operators execute the if instruction despite the condition isn't fullfiled, increment is triggered
        if (false & (i++ < 100))
            System.out.println("that is not executed");
        System.out.println("the number of executed if instructions: " + i);

        i = 0;

        //condition operator won't execute the second expression because the first one is false, increment isn't triggered
        if (false && (i++ < 100))
            System.out.println("that is not executed");
        System.out.println("the number of executed if instructions: " + i);
    }
}
