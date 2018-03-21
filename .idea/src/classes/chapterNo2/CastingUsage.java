package classes.chapterNo2;

public class CastingUsage {
    public static void main(String args []){
        int i;

        for(i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 a decimal fraction: " + (double) i / 3);
            System.out.println();
            //the case shows how to promote int to double so it's possible to display the decimal fraction of division
        }
    }
}
