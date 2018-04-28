package classes.chapterNo5.Array;

public class MinMaxUpgraded {
    public static void main(String args[]) {
        //java automatically assings memory sufficient to store submitted data, new operator is not necessary
        int nums[] = {99, -10, 100123, 18, -987, 5454, 463, -9, 287, 49};
        int max, min;

        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("the smallest and the biggest numbers are: " + min + " " + max);
    }
}