package classes.chapterNo3.chapterNo3Review;

import com.sun.tools.internal.ws.processor.model.java.JavaException;

public class KeyboardCharInput {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore;
        int spaces = 0;
        do {
            System.out.println("Press the '.' on your keyboard then press Enter");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == ' ') {
                spaces++;
            }
        } while (ch != '.');
        System.out.println("End of the program\nnumber of spaces = " + spaces);
    }
}
