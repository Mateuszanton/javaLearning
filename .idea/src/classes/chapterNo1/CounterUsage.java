package classes.chapterNo1;

/**
 * Created by Matesteusz on 13.03.2018.
 */
public class CounterUsage {
    public static void main(String args[]) {
        double gallons;
        double litres;
        int counter;

        counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.7854;

            System.out.println(gallons + "gallons is: " + litres);

            counter++;

// every 10th counter displays empty line
            if (counter == 10) {
                System.out.println();
                counter = 0; //counter reset
            }
        }
    }
}
