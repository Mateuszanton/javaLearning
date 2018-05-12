package classes.chapterNo5.Queues;

public class QueueUsage {
    public static void main(String args[]) {
        QueueClass bigQ = new QueueClass(100);
        QueueClass smallQ = new QueueClass(4);
        char ch;
        int i;

        System.out.println("Using bigQ queue to store the alphabet");
        //placing alphabet characters in bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        //loading and printing bigQ elements
        System.out.print("bigQ queue contents: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println('\n');

        System.out.println("Using smallQ queue to generate errors");
        //using smallQ to generate errors
        for (i = 0; i < 5; i++) {
            System.out.print("attempting to store in queue character: " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        //further queue smallQ errors
        System.out.print("smallQ queue contains: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
        }
    }

}