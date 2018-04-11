package classes.chapterNo3;

public class ContinueAndLabel {
    public static void main(String args []){
        outerLoop:
        for (int i =1; i <10; i++){
            System.out.print("\nexternal loop procedeeng " + i + ", internal loop: ");
            for (int j = 1; j < 4; j++) {
                if (j == 5) continue outerLoop; // outer loop continuing
                System.out.print(j + " ");
            }
        }
    }
}