package classes.chapterNo5.Array;

public class LengthUsage {
    public static void main(String args[]) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = {
                {1, 2, 4},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Table list component: " + list.length);
        System.out.println("Table nums component: " + nums.length);
        System.out.println("Table table component: " + table.length);
        System.out.println("Table table[0] component: " + table[0].length);
        System.out.println("Table table[1] component: " + table[1].length);
        System.out.println("Table table[2] component: " + table[2].length);

        // init using length
        for (int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.print("table list contents: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}