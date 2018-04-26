package classes.chapterNo4.Constructors;

public class ConsWithParameteUsage {
    public static void main(String args []){

        ConstructorWithParameters consp1 = new ConstructorWithParameters(6);
        ConstructorWithParameters consp2 = new ConstructorWithParameters(4);

        System.out.println(consp1.x + " " + consp2.x);
    }
}