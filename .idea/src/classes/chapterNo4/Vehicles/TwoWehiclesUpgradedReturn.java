package classes.chapterNo4.Vehicles;

public class TwoWehiclesUpgradedReturn {
    public static void main(String args[]) {
        VehicleUpgradedReturn minivan = new VehicleUpgradedReturn();
        VehicleUpgradedReturn sportscar = new VehicleUpgradedReturn();

        minivan.passengers = 2;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;

        //range() method usage
        System.out.println("Minivan transports " + minivan.passengers + " the range is " + minivan.range() + " km");
        System.out.println("Sportscar transports " + sportscar.passengers + " the range is " + sportscar.range() + " km");
    }
}