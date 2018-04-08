package classes.chapterNo3;

public class DoWhileGuessGame {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore, answer = 'k';

        do {
            System.out.println("Guess letter form a to z, press and tap Enter: ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer)
                System.out.println("Congratulations it's: " + ch);
            else {
                System.out.println("You haven't guessed");
                if (ch < answer)
                    System.out.println("it was to low");
                else
                    System.out.println("it was to high");
                System.out.println("Try again");
            }
        } while (answer != ch);
    }
}

