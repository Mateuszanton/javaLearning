package classes.chapterNo3.chapterNo3Review;

public class ContinueIntruction {
    public static void main(String args []) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            if (i % 2 != 0) continue;
            System.out.println();
        }
    }
}
