package classes;

/**
 * Created by Matesteusz on 12.03.2018.
 */
public class VariableUsing {
    public static void main(String args[]) {

        int var1 = 1024; //deklaracja zmiennej
        int var2;

//        var1 = 1024; //przypisanie wartosci do zmiennej

        System.out.println("var1 zawiera" + var1);

        var2 = var1 / 2;

        System.out.print("var2 zawiera var 1 / 2: ");
        System.out.println(var2);
    }
}
