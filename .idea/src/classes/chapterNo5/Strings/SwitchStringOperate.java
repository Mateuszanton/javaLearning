package classes.chapterNo5.Strings;

public class SwitchStringOperate {
    public static void main(String args[]) {
        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("connecting");
                break;

            case "cancel":
                System.out.println("aborting");
                break;

            case "disconnect":
                System.out.println("disconnecting");
                break;
            default:
                System.out.println("wrong command");

        }
    }
}