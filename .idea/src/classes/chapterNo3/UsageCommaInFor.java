package classes.chapterNo3;

public class UsageCommaInFor {
    static public void main(String args []){
        int i, j;
        for(i = 0, j = 10; i < j; i ++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}
