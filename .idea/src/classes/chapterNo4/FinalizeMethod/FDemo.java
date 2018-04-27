package classes.chapterNo4.FinalizeMethod;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    //executed before object deleting
    protected void finalize() {
        System.out.println("deleting object with identyficator: " + x);
    }

    //generating object which is abandoned immediately
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
