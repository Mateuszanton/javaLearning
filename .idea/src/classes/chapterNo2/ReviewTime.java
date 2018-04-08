package classes.chapterNo2;

import com.sun.tools.internal.ws.processor.model.java.JavaException;

public class ReviewTime {
    public static void main(String args [])
       throws java.io.IOException{
            char ch;
            System.out.println("Please type any char on keyboard");

            ch = (char) System.in.read();
            if (ch !=  ' ') {
                System.out.println("This is your java review\nand this is your char:  " + ch);
            }
        }
    }

