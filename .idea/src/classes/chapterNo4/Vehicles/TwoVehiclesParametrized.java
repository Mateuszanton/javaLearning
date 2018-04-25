package classes.chapterNo4.Vehicles;

public class TwoVehiclesParametrized {
    public static void main(String args[]) {
        VehicleParameterized microvan = new VehicleParameterized();
        VehicleParameterized car = new VehicleParameterized();
        int distance = 252;

        microvan.passengers = 7;
        microvan.fuelcap = 65;
        microvan.lkm = 9.1;

        car.passengers = 2;
        car.fuelcap = 55;
        car.lkm = 12.5;


        System.out.println("The minivan needs " + microvan.fuelneeded(distance) + " litres of pertrol to drive  "
                + distance + " kilometers");
        System.out.println("The minivan needs " + car.fuelneeded(distance) + " litres of pertrol to drive  "
                + distance + " kilometers");
    }
}