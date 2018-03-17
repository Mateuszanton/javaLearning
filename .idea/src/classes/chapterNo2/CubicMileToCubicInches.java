package classes.chapterNo2;

/**
 * Created by Matesteusz on 17.03.2018.
 */
public class CubicMileToCubicInches {
    public static void main(String args []){
        long cubicInches;
        long cubicMile;

        cubicMile = 5280 * 12;
        cubicInches = cubicMile * cubicMile * cubicMile;

        System.out.println("1 cubic mile contains " + cubicInches + " cubic ichnes");
    }
}
