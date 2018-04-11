package classes.chapterNo3;


public class HelpSystemFinalBreakContinue {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore;
        for (; ; ) {
            do {
                System.out.println("Instruction syntax information:");
                System.out.println("\t1. if");
                System.out.println("\t2. switch");
                System.out.println("\t3. for");
                System.out.println("\t4. while");
                System.out.println("\t5. do while");
                System.out.println("\t6. break");
                System.out.println("\t7. continue");
                System.out.println("Choose instruction number or press 'q' to terminate");

                ch = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (ch < '1' | ch > '7' & ch != 'q');

            if (ch == 'q') break;

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
                case '3':
                    System.out.println("for loop instruction:\n");
                    System.out.println("for (initialization; condition; iteration");
                    System.out.println("instruction;");
                    break;
                case '4':
                    System.out.println("while loop instruction:\n");
                    System.out.println("while (condition) instruction;");
                    break;
                case '5':
                    System.out.println("do while loop instruction:\n");
                    System.out.println("do {");
                    System.out.println("instruction");
                    System.out.println("} while (condition) instruction;");
                    break;
                case '6':
                    System.out.println("break instruction:\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("continue instruction:\n");
                    System.out.println("continue; or continue label;");
                    break;
            }
            System.out.println();
        }
    }
}