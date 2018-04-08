package classes.chapterNo3;

public class BreakInfiniteForLoop {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore;

        for (int i = 0; ; i++) {
            System.out.println(i);
            ch = (char) System.in.read();
            if (ch == 'q') break;
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');

        }
        System.out.println("q is pressed, the loop is terminated!");
    }
}
