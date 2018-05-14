package classes.chapterNo5.ForEachLoop;

public class NoChange {
    public static void main(String args[]) {
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : list) {
            System.out.print(x + " ");
            x = x * 10; //it doesn't change table list elements, it doesn't modify the table list
        }
        System.out.println();

        for (int x : list)
            System.out.print(x + " ");

        System.out.println();
    }
}