package classes.chapterNo5.ForEachLoop;

public class SearchUsingForEach {
    public static void main(String args[]) {
        int list[] = {1, 3, 4, 5, 6, 22, 11, 23, 35, 55, 12, 18};
        boolean found = false;
        int val = 22;
        int iteration = 0;

        for (int i : list) {
            iteration++;
            if (i == val) {
                found = true;
                break;
            }
        }
        System.out.println("the number " + val + " has been found, it took " + iteration + " iteration(s)");
    }
}