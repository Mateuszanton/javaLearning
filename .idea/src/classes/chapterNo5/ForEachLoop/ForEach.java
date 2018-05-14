package classes.chapterNo5.ForEachLoop;

public class ForEach {
    public static void main(String args[]) {


        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : list){
            System.out.println("x is equal to " + x);
            sum += x;
        }
        System.out.println("the sum is " + sum);
    }
}