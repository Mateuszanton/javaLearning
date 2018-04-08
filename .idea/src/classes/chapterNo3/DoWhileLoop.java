package classes.chapterNo3;

public class DoWhileLoop {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore;

        do {
            System.out.println("Press any key on your keyboard then press Enter");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            }while(ignore != '\n');
        } while (ch != 'q');
        System.out.println("you have pressed 'q' the loop is ended");
    }
}
