package classes;

/**
 * Created by Matesteusz on 14.03.2018.
 */
public class InchToMeters {
    public static void main(String args[]) {
        double inch;
        double meter;
        int counter;


        counter = 0;
        for (inch = 0; inch <= 144; inch++) {
            meter = inch * 39.37;
            System.out.println(inch + "is equal to " + meter);
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

