package classes.chapterNo4.HelpSystem;

public class HelpClassDemo {

    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore;
        Help helpobj = new Help();

        for (; ; ) {
            do {
                helpobj.showmenu();
                ch = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!helpobj.isValid(ch));
            if (ch == 'q') break;

            System.out.println("\n");

            helpobj.helpOn(ch);
        }
    }
}