package classes.chapterNo3;

public class BreakForLoop {
    public static void main(String args []){
        int num = 100;

        //the loop is executing till squared i variable is less than num  var
        for (int i = 0; i <= 100; i ++){
            if (i * i >= num) break;
            System.out.print(i + " ");
        }
        System.out.println("The loop is ended");
    }
}
