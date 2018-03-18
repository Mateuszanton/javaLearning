package classes.chapterNo2;

/**
 * Created by Matesteusz on 18.03.2018.
 */
public class LightningDistanceCalc {
    public static void main(String args []){
        double time = 7.2;
        int soundVelocityInMetersPerSec = 330;
        double distance = time * soundVelocityInMetersPerSec;

        System.out.println("The distance to the lightning is: " + distance + " meters from here");
    }
}
