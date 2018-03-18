package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class DistanceToObjectCalc {
    public static void main(String args []){
        double time = 11.3;
        int soundVelocity = 330;
        double distanceToTheObject = time * soundVelocity / 2;
        System.out.println("the distance to the rock is: " + distanceToTheObject + " meters from here");
    }
}
