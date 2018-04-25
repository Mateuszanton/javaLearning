package classes.chapterNo4.TwoParametersUsage;

public class IsFactor {
    public static void main(String args []){
        Factor factor = new Factor();

        if(factor.isFactor(1, 5)) System.out.println("1 is divisible by 5");
        if(factor.isFactor(4, 2)) System.out.println("4 is divisible by 2");
        if(factor.isFactor(6, 3)) System.out.println("6 is divisible by 3");
    }
}