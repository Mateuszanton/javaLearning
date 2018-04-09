package classes.chapterNo3;

public class BreakLabelDifferentBlocks {
    public static void main(String args[]) {
        int i, x;

        WrongLabel:
        for (x = 0; x < 100; x++) {
            System.out.println("instruction");
        }
        for (i = 0; i < 50; i++) {
            if (i == 2) break; //WrongLabel; // error occurs because the break instruction is out of the label range
            System.out.println("This is wrong place for the break");
        }
    }
}
