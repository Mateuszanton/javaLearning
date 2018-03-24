package classes.chapterNo3;

public class SwitchInstructionWithoutBreakeInst {
    public static void main(String args[]) {
        int i;

        for (i = 0; i <= 5; i++)
            /* the switch instruction will be executed when expression is equal to the variable until the break occurs
            OR the switch instruction ends */
            switch (i) {
                case 1:
                    System.out.println("i is equal to 1");
                case 2:
                    System.out.println("i is equal to 2");
                case 3:
                    System.out.println("i is equal to 3");
                case 4:
                    System.out.println("i is equal to 4");
            }
    }
}
