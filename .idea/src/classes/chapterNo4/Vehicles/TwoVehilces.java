package classes.chapterNo4.Vehicles;

public class TwoVehilces {
    public static void main(String args[]) {
        Vehicle volvo = new Vehicle(4, 60, 6);
        Vehicle warszawa = new Vehicle(2, 25, 12);
        double litres;
        int distance = 344;

        litres = volvo.fuelneeded(distance);
        System.out.println("volvo needs " + litres + " to drive " + distance + " km, the range of volvo is: " +
                volvo.range() + " km");

        litres = warszawa.fuelneeded(distance);
        System.out.println("warszawa needs " + litres + " to drive " + distance + " km, the range of warszawa is: " +
                warszawa.range() + " km");
    }
}