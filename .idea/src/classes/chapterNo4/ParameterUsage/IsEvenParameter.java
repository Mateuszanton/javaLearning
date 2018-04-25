package classes.chapterNo4.ParameterUsage;

public class IsEvenParameter {
    public static void main(String args []){
        ChkNum e = new ChkNum();
        if(e.isEven(10)) System.out.println("10 is even");
        if(e.isEven(11)) System.out.println("11 is even");
        if(e.isEven(12)) System.out.println("12 is even");
    }
}
