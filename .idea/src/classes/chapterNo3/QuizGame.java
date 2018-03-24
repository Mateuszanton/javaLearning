package classes.chapterNo3;

public class QuizGame {
    public static void main(String args[])
            throws java.io.IOException {
        char ch = 'b';
        char g;
        System.out.println("Type the char i am thinking of and press Enter");
        g = (char) System.in.read();
        if (g == ch)
            System.out.println("that's right i was thinking about " + ch);
        else {
            System.out.print(g + " unfortunately, your char is too ");

            //nested if instruction
            if (g < ch)
                System.out.print("low");
                else
                    System.out.print("high");
        }
    }
}
