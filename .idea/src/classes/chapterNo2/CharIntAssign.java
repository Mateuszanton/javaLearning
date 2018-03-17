package classes.chapterNo2;

/**
 * Created by Matesteusz on 17.03.2018.
 */
public class CharIntAssign {
    public static void main(String args []){
        char character;

        character = 'X';
        System.out.println("char is equal to: " + character);
        character++;
        System.out.println("now char is equal to: " + character);
        character = 90; //in ASCII code 90 corresponds to Z, ASCII is first 127 UNICODE code values
        System.out.println("finally char is equal to: " + character);

    }
}
