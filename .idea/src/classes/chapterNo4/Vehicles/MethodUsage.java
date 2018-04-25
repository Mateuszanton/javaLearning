package classes.chapterNo4.Vehicles;

public class MethodUsage {
    public static void main(String args[]) {
        VehicleBasic minivan = new VehicleBasic();
        VehicleBasic sportscar = new VehicleBasic();

        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;

        System.out.print("minivan transports " + minivan.passengers + " persons ");
        minivan.range();

        System.out.print("sportscar transports " + sportscar.passengers + " persons ");
        sportscar.range();
    }
}
