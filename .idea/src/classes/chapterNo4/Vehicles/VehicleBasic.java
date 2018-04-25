package classes.chapterNo4.Vehicles;

public class VehicleBasic {
    int passengers; //number of passengers
    int fuelcap;    //capacity of fuel tank
    double lkm;     //fuel consumption

    void range() {  //void means that the method doesn't return any value to source code
        System.out.println("The range (km): " + (int) (fuelcap / lkm * 100));
    }
}


