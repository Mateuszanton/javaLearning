package classes.chapterNo3;

public class BreakLabel {
    public static void main(String args[]) {
        int i;

        for (i = 1; i < 4; i++) {

            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is equal to: " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        System.out.println("Control won't be triggered here. This string will be never displayed");
                    }
                    System.out.println("Outside the third block");
                }
                System.out.println("Outside the second block");
            }
            System.out.println("Outside the first block");
        }
        System.out.println("Outside the for loop");
    }
}
