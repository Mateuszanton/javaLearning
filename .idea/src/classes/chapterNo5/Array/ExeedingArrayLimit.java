package classes.chapterNo5.Array;

public class ExeedingArrayLimit {
    public static void main(String args []){
        int list[] = new int[10];

        for (int i = 0; i < 100; i ++)
            list[i] = i;
        //after running the script the error message that array limit is exceeded is displayed
    }
}