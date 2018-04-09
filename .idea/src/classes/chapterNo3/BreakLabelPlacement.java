package classes.chapterNo3;

public class BreakLabelPlacement {
    public static void main(String args[]) {
        int x = 0, y = 0;

        //Label before for loop
        System.out.println();
        Stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break Stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
        for (x = 0; x < 5; x++) {
            Stop2:
            {
                for (y = 0; y < 5; y++) {
                if (y == 2) break Stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
        }
    }
}


