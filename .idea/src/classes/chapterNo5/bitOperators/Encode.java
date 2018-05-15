package classes.chapterNo5.bitOperators;

public class Encode {
    public static void main(String args[]) {
        String msg = "This is test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        //message encryption
        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("encrypted message: ");
        System.out.println(encmsg);

        //message decryption
        for (int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("decrypted message: ");
        System.out.println(decmsg);
    }
}
//R1 = X ^ Y; R2 = R1 ^ Y; R2 = X

/* 1010
   0110
^  1100
 */