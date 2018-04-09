package classes.chapterNo3;

public class BreakNestedLoop {
    public static void main(String args[]) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop counter: " + i);
            System.out.print("    internal loop counter: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops work is ended");
    }
}