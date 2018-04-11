package classes.chapterNo3;

public class ContinueInstruction {
    public static void main(String args[]) {
        int i;

        //prints even numbers from 0 to 100
        for (i = 0; i < 100; i++) {
            if (i % 2 != 0) continue; // the earlier loop iteration is imposed for uneven numbers so println is skiped
            System.out.println(i);
        }
    }
}
