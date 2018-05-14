package classes.chapterNo5.Strings;

public class SubstringDemo {
    public static void main(String args[]) {
        String orgstring = "The java is cool";
        String substr = orgstring.substring(4, 16);

        System.out.println("original string: " + orgstring);
        System.out.println("substring string: " + substr);
    }
}