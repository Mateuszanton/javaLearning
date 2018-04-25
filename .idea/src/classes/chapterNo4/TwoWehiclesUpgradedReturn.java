package classes.chapterNo4;

public class TwoWehiclesUpgradedReturn {
    public static void main(String args []){
        VehicleUpgradedReturn minivan = new VehicleUpgradedReturn();
        VehicleUpgradedReturn sportscar = new VehicleUpgradedReturn();

        double range1, range2;

        minivan.passengers = 2;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan transports " + minivan.passengers + " the range is " + range1 + " km");
        System.out.println("Sportscar transports " + sportscar.passengers + " the range is " + range2 + " km");
    }
}

