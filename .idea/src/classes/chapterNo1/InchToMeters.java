package classes.chapterNo1;

/**
 * Created by Matesteusz on 14.03.2018.
 */

/*
result: inches to meters conversion for 12 feet with empty line in every 12th inch
 */
public class InchToMeters {
    public static void main(String args[]) {
        double inch = 0;
        double meter;
        int counter;
        int feet = 12;
        double numberOfInchesInFeet;
        numberOfInchesInFeet = 12 * feet;

        counter = 0;
        for (inch = 0; inch <= numberOfInchesInFeet; inch++) {
            meter = inch * 0.0254;
            System.out.println(inch + " inches is equal to " + meter + " meters");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

