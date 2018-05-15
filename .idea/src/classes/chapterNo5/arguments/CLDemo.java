package classes.chapterNo5.arguments;

public class CLDemo {
    public static void main(String args[]) {
        System.out.println("arguments + " + args.length + " were passed to the main method when it " +
                "was developed as table type String");
        System.out.println("Here they are: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]:" + args[i]);
        //IntelliJ  > Run > Edit Configurations... > Program arguments > input one two three
    }
}