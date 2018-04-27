package classes.chapterNo4.ThisKeyword;

public class DemoPwr {
    public static void main(String args []){
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to " + x.e + " power is equal to " + x.get_pwr());
        System.out.println(y.b + " raised to " + y.e + " power is equal to " + y.get_pwr());
        System.out.println(z.b + " raised to " + z.e + " power is equal to " + z.get_pwr());
    }
}