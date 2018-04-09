package classes.chapterNo3;


public class BreakLabel2 {
    public static void main(String args[]) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done;
                }
                System.out.println("out of k loop");
            }
            System.out.println("out of j loop");
        }
        System.out.println("out of i loop"); //before the done label
    }

}