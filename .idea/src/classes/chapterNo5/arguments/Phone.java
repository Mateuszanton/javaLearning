package classes.chapterNo5.arguments;

public class Phone {
    public static void main(String args[]) {
        String numbers[][] = {
                {"Tomek", "555 332 222"},
                {"Maria", "888 654 454"},
                {"Janson", "666 888 555"},
                {"Barbara", "555 444 666"}
        };
        int i;

        if (args.length != 1) //Program demands one invocation argument
            System.out.println("Invocation: Java Phone <name>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Lack of the name in phonebook.");
            //IntelliJ  > Run > Edit Configurations... > Program arguments > input Maria
        }
    }
}