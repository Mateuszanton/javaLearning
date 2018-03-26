package classes.chapterNo3;

public class ControlVarDeclarationInFor {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        //calc factorial from 5
        for (int i = 1; i <= 5; i++) {
            sum += i;                                                                    // i is know inside the loop
            fact *= i;
        }
        System.out.println("the sum is: " + sum + "\nthe factorial is: " + fact);        // i is not known anymore
    }
}
