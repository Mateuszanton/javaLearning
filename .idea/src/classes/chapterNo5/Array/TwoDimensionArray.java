package classes.chapterNo5.Array;

public class TwoDimensionArray {
    // the two dimension array is a list of one dimension array
    public static void main(String args[]){
        // declaration of the table:

        int table[][] = new int[3][4];
        int t, i;

        for (t = 0; t < 3; t++) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");

            }
            System.out.println();
        }
    }
}