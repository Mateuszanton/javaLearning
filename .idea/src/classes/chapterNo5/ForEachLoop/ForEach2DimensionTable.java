package classes.chapterNo5.ForEachLoop;

public class ForEach2DimensionTable {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];

        //filling the table nums
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums[i].length; j++)
                nums[i][j] = (i + 1) * (j + 1);

        //using extended for loop to sum and print table nums elements
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("the table nums element is: " + y);
                sum += y;
            }
        }
        System.out.println("The sum of talbe list elements is: " + sum);
    }
}