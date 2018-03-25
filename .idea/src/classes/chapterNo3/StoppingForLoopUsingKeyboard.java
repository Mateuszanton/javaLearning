package classes.chapterNo3;

public class StoppingForLoopUsingKeyboard {
    public static void main(String args[])
            throws java.io.IOException {
        int i;
        System.out.println("Type 'S' then enter to terminate the loop");
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Loop progess: " + i);
    }
}
