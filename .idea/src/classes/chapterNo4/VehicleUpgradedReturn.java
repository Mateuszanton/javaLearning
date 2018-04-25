package classes.chapterNo4;

public class VehicleUpgradedReturn {
    int passengers;
    int fuelcap;
    double lkm;

    //returns the range
    int range() {
        return (int) (fuelcap / lkm * 100);
    }
}


