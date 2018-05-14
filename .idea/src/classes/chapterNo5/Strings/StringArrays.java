package classes.chapterNo5.Strings;

public class StringArrays {
    public static void main(String args[]) {
        String strs[] = {"It", "is", "only", "a test,"};
        System.out.println("Initial table contents: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        //changes strings
        strs[1] = "was";
        strs[3] = "usuall test!";

        System.out.println("Modified table contents: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println();
    }
}