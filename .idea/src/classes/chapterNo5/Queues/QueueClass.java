package classes.chapterNo5.Queues;

public class QueueClass {
    char q[]; //table which stores the queue
    int putloc, getloc; //put and get operation indexes

    QueueClass(int size){
    q = new char[size + 1]; // assigns memory to queue, first element is 0, will be use to identify empty queue
        putloc = getloc = 0;
    }
    void put(char ch){
        if (putloc == q.length - 1){
            System.out.println(" -- the queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    char get() {
        if (getloc == putloc){
            System.out.println(" --queue is empty");
            return  (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
