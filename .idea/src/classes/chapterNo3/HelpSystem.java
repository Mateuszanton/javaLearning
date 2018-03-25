package classes.chapterNo3;


public class HelpSystem {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;

        System.out.println("Instruction syntax infromation:\n\t1. if\n\t2. switch\nChoose instruction number");
        ch = (char) System.in.read();

        System.out.println("\n");

        switch (ch) {
            case '1':
                System.out.println("If conditional instruction:\n");
                System.out.println("If (condition) instruction;");
                System.out.println("Else instruction;");
                break;
            case '2':
                System.out.println("Switch choice instruction:\n");
                System.out.println("Switch (expression){");
                System.out.println("\tCase: constant:");
                System.out.println("\t\tinstructions sequence");
                System.out.println("\t\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("the choice was wrong.");

        }
    }
}
