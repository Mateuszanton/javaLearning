package classes.chapterNo5.Array;

public class TwoDimensionArray {
    // the two dimension array is a list of one dimension array
    public static void main(String args[]) {
        // declaration of the table:
        int table[][] = new int[5][6];
        int a, b, c, d;
        for (a = 0; a < 5; a++) {
            for (b = 0; b < 6; ++b) {
                table[a][b] = (a * 6) + b + 1;
                System.out.print(table[a][b] + " ");
            }
            System.out.println();
        }
    }
}