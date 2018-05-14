package classes.chapterNo5.Strings;

public class StringsIsAnObject {
    public static void main(String args[]){
        String str = new String("Hello");
        String str2 = new String(str);
        String str3 = "Strings gots a power in Java";
        System.out.println(str + " " + str2 + " " + str3);
    }
}