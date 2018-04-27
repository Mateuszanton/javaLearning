package classes.chapterNo4.Vehicles;

public class TwoVehiclesBasic {
    public static void main(String args[]) {
        //instance of Vehicle class == object, new assings the reference to new variable
        VehicleBasic microvan = new VehicleBasic();
        VehicleBasic car = new VehicleBasic();
        int range1, range2;

        //assigning values to minivan object components
        microvan.passengers = 7;
        microvan.fuelcap = 65;
        microvan.lkm = 9.1;

        car.passengers = 2;
        car.fuelcap = 55;
        car.lkm = 12.5;

        //calculation multivan range when full fuel tank
        range1 = (int) (microvan.fuelcap / microvan.lkm * 100);
        range2 = (int) (car.fuelcap / car.lkm * 100);

        System.out.println("The minivan transports " + microvan.passengers + " persons and his range is "
                + range1 + " kilometers");

        System.out.println("The sportscar transports " + car.passengers + " persons and his range is "
                + range2 + " kilometers");
    }
}