package classes.chapterNo5.ternaryOperator;

public class NoZeroDivUpgraded {
    public static void main(String args[]) {
        int result;

        for (int i = -6; i < 5; i++){
            if (i !=0 ? true : false) // the instruction is executed only if condition true.
                System.out.println("100 / " + i + " is equal to " + 100 / i);
        }
    }
}