package classes.chapterNo3;

public class ReadKeyboardChar {
    public static void main(String args [])
        throws java.io.IOException{
        char ch;
        System.out.println("type the char then press Enter");
        ch = (char) System.in.read();
        System.out.println("the char is: " + ch);
    }
}
