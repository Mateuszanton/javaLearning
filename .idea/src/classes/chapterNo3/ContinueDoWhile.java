package classes.chapterNo3;

public class ContinueDoWhile {
    public static void main(String args[]){
        int i = 1;

        do {
            System.out.println("here is do instruction");
            /* if the condition is fulfilled the rest of the block is ignored and loop execution
            is moved to the conditional expression, executing is continued */
            if (i == 7) continue;
            System.out.println("nie kontynuowano");
            i++;
        }while (i != 9);
            System.out.println("the loop is ended " + i);
    }
}
