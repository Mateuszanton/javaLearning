package classes.chapterNo3;

public class SwichInstruction {
    public static void main(String args[]) {
        int i;

        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i is equal to 0");
                    break;
                case 1:
                    System.out.println("i is equal to 1");
                    break;
                case 2:
                    System.out.println("i is equal to 2");
                    break;
                case 3:
                    System.out.println("i is equal to 3");
                    break;
                case 4:
                    System.out.println("i is equal to 4");
                    break;
                default:
                    System.out.println("i is greather than or equal to 5");
            }
    }
}
