package classes.chapterNo3.chapterNo3Review;

public class LowerAndUpperCasesInputsMod {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore;
        int iteration = 0, k;
        do {
            System.out.println("Press the '.' on your keyboard then press Enter");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch >= 97 && ch <= 122) {
                ch -= 32;
                System.out.println(ch);
            } else if (ch >= 65 && ch <= 90) {
                ch += 32;
                System.out.println(ch);
            } else System.out.println(ch);
            iteration++;
        } while (ch != '.');
        System.out.println("End of the program\nnumber of attempts = " + iteration);
    }
}