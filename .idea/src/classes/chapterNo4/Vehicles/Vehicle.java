package classes.chapterNo4.Vehicles;

public class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;

    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    int range() {
        return (int) (fuelcap / lkm * 100);
    }

    double fuelneeded(int km){
        return (double) km / 100 * lkm;
    }
}