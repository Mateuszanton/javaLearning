package classes.chapterNo5.Array;

public class TableReference {
    static public void main(String args[]) {
        int i, j;
        int table1[] = new int[10];
        int table2[] = new int[10];

        for (i = 0; i < 10; i++) {
            table1[i] = i;
            table2[i] = -i;
        }

        System.out.print("table1: ");
        for (j = 0; j < 10; j++)
            System.out.print(table1[j] + " ");
        System.out.println();


        System.out.print("table2: ");
        for (j = 0; j < 10; j++)
            System.out.print(table2[j] + " ");
        System.out.println();

        table2 = table1;

        System.out.print("table2 after assignment to table1: ");
        for (j = 0; j < 10; j++)
            System.out.print(table2[j] + " ");
        System.out.println();

        table2[3] = 99;

        System.out.print("table1 after modfication by table2: ");
        for (j = 0; j < 10; j++)
            System.out.print(table1[j] + " ");
        System.out.println();
        //it proves that after assignment table1 to table2 both variables has reference to the same object!
    }
}