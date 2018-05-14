package classes.chapterNo5.Strings;

public class StrOps {
    public static void main(String args[]) {
        //operations on strings
        String str1 = "It's number one in Web applications programming";
        String str2 = new String(str1);
        String str3 = "Strings in Java can do a lot";
        String str4;
        int result, idx;
        char ch;

        System.out.println("Length of string str1: " + str1.length());

        //printing str1 char by char
        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i) + " ");
        System.out.println();

        //equals() compares two objects sequency, == checks ONLY if two references are related to one object.
        if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2");
        } else
            System.out.println("str1 is not equal to str2");

        if (str1.equals(str3)) {
            System.out.println("str1 is equal to str3");
        } else
            System.out.println("str1 is not equal to str3");

        result = str1.compareTo(str3);
        if (result < 0)
            System.out.println("str1 is shorter than str3");
        else if (result > 0)
            System.out.println("str1 is longer than str3");
        else
            System.out.println("str1 length is equal to str3");

        //assings new string to str3
        str2 = "one, two, three, one";

        idx = str2.indexOf("one");
        System.out.println("string one first index occurence " + idx);

        idx = str2.lastIndexOf("one");
        System.out.println("string one the last index occurence " + idx);

        //string joining using concatenation mark '+':
        str4 = str1 + ", " + str2 + ", " + str3;
        System.out.println(str4);
    }
}