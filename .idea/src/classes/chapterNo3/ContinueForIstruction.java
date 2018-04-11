package classes.chapterNo3;

public class ContinueForIstruction {
    public static void main(String args[]) {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("the loop is runing for the " + i + " time");
           /* the instruction is ignored when i == 3, first the iteration then loop condition is executed
           then the loop is beeing continued */
            if (i == 4) continue;
            System.out.println(i);
        }
    }
}
