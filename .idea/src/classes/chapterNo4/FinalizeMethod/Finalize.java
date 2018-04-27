package classes.chapterNo4.FinalizeMethod;

public class Finalize {
    public static void main(String args []){
        int count;

        FDemo ob = new FDemo(0);

        // Creates many objects, it will also execute garbage collector
         for (count = 1; count < 10000000; count ++)
             ob.generator(count);
    }
}
